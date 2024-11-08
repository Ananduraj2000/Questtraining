package com.quest.practice.vars;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();

        int len = s.length();
        System.out.println("The length of the string is: " + len);

        String str=s.toUpperCase();
        System.out.println("The string in uppercase: " + str.toUpperCase());

        String sub=s.substring(2,7);
        System.out.println(sub);

        String t=s.trim();
        System.out.println("trimmed word is "+t);

        System.out.println("enter the old word");
        String old=sc.nextLine();

        System.out.println("enter the new word");
        String new1=sc.nextLine();

        String newName=s.replace(old,new1);
        System.out.println(newName);

        System.out.println("Enter another string");
        String str1=sc.nextLine();

        String l=str1.toLowerCase();
        System.out.println("The string in lowercase: " + l.toLowerCase());

        System.out.println("enter the character");
        String in=sc.nextLine();

        int inn=str1.indexOf(in);
        System.out.println("index number : " + inn);

    }
}
