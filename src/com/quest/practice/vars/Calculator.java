package com.quest.practice.vars;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double result = sc.nextDouble();
        boolean run=true;
        while (run) {
            System.out.println("Current result: " + result);
            System.out.println("Choose an operation: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6.clear: ");
            System.out.println("7.Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the number for addition: ");
                    result = result + sc.nextDouble();
                    break;

                case 2:
                    System.out.println("Enter the number for subtraction: ");
                    result = result - sc.nextDouble();
                    break;
                case 3:
                    System.out.println("Enter the number for multiplication: ");
                    result = result * sc.nextDouble();
                    break;
                case 4:
                    System.out.println("Enter the number for division: ");
                    double divisor = sc.nextDouble();
                    if (divisor != 0) {
                        result = result / divisor;
                    } else {
                        System.out.println("Cannnot divide by zero");
                    }
                    break;
                case 5:
                    if (result > 0) {
                        result = Math.sqrt(result);
                    } else {
                        System.out.println("Not defined");
                    }
                    break;
                case 6:
                    result = 0;
                    System.out.println("Result reset to Zero");
                    break;
                case 7:
                    run=false;
                    System.out.println("Exiting Calculator");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
//            System.out.println("\nDo you want to perform another operation? (yes/no)");
//            String continueChoice = scanner.next().trim();
//            if (!continueChoice.equals("yes")) {
//                System.out.println("Exiting calculator");
//                break;
//
//            }

        }
    }
}
