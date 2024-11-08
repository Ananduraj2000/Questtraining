package com.quest.practice.vars;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        if(str==null){
            System.out.println("the string is null");
            return;
        }
        StringBuilder sb=new StringBuilder(str);
        StringBuilder reverse = sb.reverse();
        String reverseString=reverse.toString();
        if(str.equals(reverseString)){
            System.out.println("the string is palindrome");
        }else{
            System.out.println("the string is not palindrome");
        }
    }
}
