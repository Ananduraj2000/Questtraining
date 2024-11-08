package com.quest.practice.vars;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int number;
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        number = sc.nextInt();
        while (number != 0) {
            sum += number % 10;
            number = number / 10;

        }
        System.out.println(sum);
    }
}
