package com.quest.practice.vars;

public class Employee {

    String name;
    double baseSalary;
    double[] monthelySalary = new double[12];
    double totalSalary = 0.0;

    //method for calculate total salary
    public int calculateTotalSalary(){
        int total = 0;
        double bonus=baseSalary*0.10;
        for(int i = 0; i < monthelySalary.length; i++){
            total += monthelySalary[i]+bonus;
        }
        return total;
    }
}
