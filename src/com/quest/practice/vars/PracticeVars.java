package com.quest.practice.vars;

public class PracticeVars {
    final static int VOTE_AGE=18;
    public static void main(String[] args) {
        int age=24;
        double salary=10000;
        char gender='M';
        String firstName="John";
        String lastName="Doe";
        System.out.println("age = "+age);
        System.out.println("salary = "+salary);
        System.out.println("gender = "+gender);
        System.out.println("firstName = "+firstName);
        System.out.println("lastName = "+lastName);

        age=20;
        System.out.println("age = "+age);
        System.out.println("Vote age is"+VOTE_AGE);
        //VOTE_AGE=24;it cannot be changed because VOTE_AGE is final

        practiceConversion();
        stringConcatenation();
        stringMethods();

    }
    private static void practiceConversion(){
        int a=20;
        double b=28.5;
        double sum=a+b;
        int round=(int)b;
        System.out.println("sum = "+sum);
        System.out.println("round = "+round);
    }
    private static void stringConcatenation(){
        String s1="Anandu";
        String s2="Raj";
        String s3=s1+" "+s2;
        System.out.println(s3);
        int roll_no=25;
        System.out.println("name ="+s3+" "+"roll no ="+roll_no);
    }
    private static void stringMethods(){
        String s1="John";
        String s2="Doe";
        String s3=new String("Welcome");
        String s4=new String("Welcome");
        System.out.println(s3.length());
        System.out.println(s3.equalsIgnoreCase(s2));
        System.out.println(s3.equals(s2));
        System.out.println(s4==s3);
    }
}
