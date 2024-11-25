package oops.customException;

import oops.exceptionLearn.CustomException;

public class Employee {

    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) throws InvalidInputException {
        if(age<18){
            throw new InvalidInputException("age must be 18 or 18 plus");
        }
        if(salary<0){
            throw new InvalidInputException("Salary cannot be 0");
        }
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
