package com.quest.practice.vars;

public class PracticeOperators {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        //arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a%b);
        System.out.println(a/b);

        //Relational operators

        System.out.println(a==b);
        System.out.println(a<b);
        System.out.println(a>b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);

        boolean x=true;
        boolean y=false;

        //Logical Operators

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(x != y);

        int z=10;
        //Assignment operator
        z +=5;//z=z+5
        //Unary operators
        System.out.println(z);
        System.out.println("post"+z++);
        System.out.println(++z+"pre");
        System.out.println(z);
        System.out.println(z--);
        System.out.println(--z);
        System.out.println(z);

        int p=10;
        int q=5;
        //Ternary operators

        int result = p>15 ? ++q : 0;
        System.out.println(result);
    }
}
