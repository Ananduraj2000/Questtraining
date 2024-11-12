package com.quest.practice.vars;

import java.util.Scanner;

public class EmployeeSalary {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int numEmployees = sc.nextInt();
        Employee[] employees = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {
            Employee employee = new Employee();
            System.out.println("Enter the name of employee " + (i + 1));
            employee.name = sc.next();
            System.out.println("Enter the base salary of employee " + (i + 1));
            employee.baseSalary = sc.nextDouble();
            for (int j = 0; j < 12; j++) {
                System.out.println("Enter the salary of month " + (j + 1) + ":");
                employee.monthelySalary[j] = sc.nextInt();
            }
            employee.totalSalary = employee.calculateTotalSalary();
            employees[i] = employee;
        }



    //display results
        for (int i = 0; i < employees.length; i++) {
            System.out.println("---Salary report---");
            System.out.println("Employee Name: "+employees[i].name);
            System.out.println("Base Salary: " +employees[i].baseSalary);
            System.out.println("Total Salary: " +employees[i].totalSalary);
        }
        System.out.println();
        System.out.println("Thank you for using the Employee Salary Management System.");
    }
}
