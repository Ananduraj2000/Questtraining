package com.quest.practice.vars;

public class DataTypes {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.println("Sum is "+sum);

        float f=10.36575f;
        System.out.println("f is "+f);

        byte b1=10;
        System.out.println("b1 is "+b1);

        char ch='a';
        System.out.println("ch is "+ch);

        double d=12.6426426464;
        System.out.println("d is "+d);

        short s1=10;
        System.out.println("s1 is "+s1);

        long l1=107252752761761817L;
        System.out.println("l1 is "+l1);

        String s="Anandu";
        System.out.println("s is "+s);

        String [] cars={"BNW","Audi","Kia"};
        System.out.println("Array is");
        for(int i=0;i<cars.length;i++){

            System.out.println(cars[i]);
        }

        int [] num={1,2,3,4,5,6};
        System.out.println("Number is "+num[4]);

    }
}
