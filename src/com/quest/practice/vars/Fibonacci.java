package com.quest.practice.vars;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements");
        n = sc.nextInt();
        if(n<0){
            System.out.println("invalid input");
            return;
        }
            int first=0;
        int second= 1;
        System.out.println("numbers are");
        for (int i = 1; i <= n; i++) {
            System.out.println(first+" ");
            int third = first+ second;
            first = second;
            second = third;


        }
    }
}
