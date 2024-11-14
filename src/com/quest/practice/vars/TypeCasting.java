package com.quest.practice.vars;

public class TypeCasting {
    public static void main(String[] args) {

        //implicit
        int n=5;
        double d=n;
        System.out.println(d);

        //explicit
        double d2=9.78;
        int n1=(int)d2;
        System.out.println(n1);


        int n3=200;
        byte b=(byte)n3;
        System.out.println(b);
    }
}
