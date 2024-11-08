package com.quest.practice.vars;

import java.util.Scanner;

public class PalingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int originalNumber=num;
        int reversedNumber=0;

        while (num!=0){
            int reminder = num%10;
            reversedNumber= reversedNumber * 10 + reminder;
            num/=10;
        }

        if(originalNumber==reversedNumber){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}
