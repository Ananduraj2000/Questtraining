package oops.abstraction;

import java.util.Scanner;

public class AnalyzerMain {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details for Equity Stock :");
        System.out.println("Stock name :");
        String stockName = sc.nextLine();
        System.out.println("Stock Symbol :");
        String symbol = sc.nextLine();
        System.out.println("Sector :");
        String sector = sc.nextLine();
        System.out.print("Number of days: ");
        int days = sc.nextInt();
        int[] prices = new int[days];
        System.out.println("Enter prices:");
        for (int i = 0; i < days; i++) {
            prices[i] = sc.nextInt();
        }
        sc.nextLine();

        EquityStockAnalyzer equityStock = new EquityStockAnalyzer(stockName, symbol, prices, sector);

        System.out.println("Enter details for Commodity Stock:");
        System.out.print("Commodity Type: ");
        String commodityType = sc.nextLine();
        System.out.print("Stock Symbol: ");
        String commoditySymbol = sc.nextLine();
        System.out.print("Number of days: ");
        days = sc.nextInt();
        int[] cPrices = new int[days];
        System.out.println("Enter prices:");
        for (int i = 0; i < days; i++) {
            cPrices[i] = sc.nextInt();
        }

        CommodityStockAnalyzer commodityStock = new CommodityStockAnalyzer("Gold", commoditySymbol, cPrices, commodityType);

        System.out.println();
        equityStock.displayAnalysis();
        System.out.println();
        commodityStock.displayAnalysis();

    }
}
