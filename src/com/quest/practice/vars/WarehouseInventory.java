package com.quest.practice.vars;

public class WarehouseInventory {
    public static void main(String[] args) {
        // Step 1: Initialize product names, warehouse quantities, and branch stock
        String[] productNames = {"Laptop", "Phone", "Tablet", "Headphones", "Smartwatch"};
        int[] warehouseStock = {120, 150, 100, 200, 80};
        int[][] branchStock = {
                {50, 30, 60},
                {40, -1, 60},
                {30, 20, 15},
                {100, 90, 80},
                {50, 55, -1}
        };

        // Step 2: Call methods to perform the required tasks
        // Task 1: Calculate and print total stock for each product
        System.out.println("Total Stock");
        System.out.println();

        calculateTotalStock(productNames, warehouseStock, branchStock);
        System.out.println();
        // Task 2: Find and print product with the maximum total stock
        findMaxStockProduct(productNames, warehouseStock, branchStock);
        System.out.println();
        // Task 3: Rank products by total stock and print ranking
        System.out.println("Highest ranking Products:");
        rankProductsByStock(productNames, warehouseStock, branchStock);
        System.out.println();
        // Task 4: Detect and print missing stock data

        detectMissingData(productNames, branchStock);
    }

    // Method 1: Calculate and print the total stock for each product
    public static void calculateTotalStock(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        for (int i = 0; i < productNames.length; i++) {
            int totalStock = warehouseStock[i];
            for (int stock : branchStock[i]) {
                if (stock != -1) { // Exclude missing data
                    totalStock += stock;
                }
            }
            System.out.println(productNames[i] + ": " + totalStock);

        }
    }

    // Method 2: Find and print the product with the maximum total stock
    public static void findMaxStockProduct(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        int maxStock = 0;
        String maxStockProduct = "";

        for (int i = 0; i < productNames.length; i++) {
            int totalStock = warehouseStock[i];
            for (int stock : branchStock[i]) {
                if (stock != -1) {
                    totalStock += stock;
                }
            }
            if (totalStock > maxStock) {
                maxStock = totalStock;
                maxStockProduct = productNames[i];
            }
        }
        System.out.println("Product with maximum stock: " + maxStockProduct + " (" + maxStock + ")");
    }

    // Method 3: Rank products by total stock and print the ranking
    public static void rankProductsByStock(String[] productNames, int[] warehouseStock, int[][] branchStock) {
        int[] totalStocks = new int[productNames.length];
        for (int i = 0; i < productNames.length; i++) {
            int totalStock = warehouseStock[i];
            for (int stock : branchStock[i]) {
                if (stock != -1) {
                    totalStock += stock;
                }
            }
            totalStocks[i] = totalStock;
        }
        for (int rank = 1; rank <= productNames.length; rank++) {
            int maxStock = -1;
            int maxIndex = -1;
            for (int i = 0; i < totalStocks.length; i++) {
                if (totalStocks[i] > maxStock) {
                    maxStock = totalStocks[i];
                    maxIndex = i;
                }
            }

            System.out.println(rank + ": " + productNames[maxIndex] + " (" + totalStocks[maxIndex] + ")");
            totalStocks[maxIndex] = -1;
        }
    }

    // Method 4: Detect missing stock data and print the products with missing data
    public static void detectMissingData(String[] productNames, int[][] branchStock) {
        for (int i = 0; i < productNames.length; i++) {
            for (int j = 0; j < branchStock[i].length; j++) {
                if (branchStock[i][j] == -1) {
                    System.out.println(productNames[i] + ": Missing stock in Branch " + (j + 1));
                }
            }
        }
    }


}
