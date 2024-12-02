package oops.test1.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class EmployeeId {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(101, "John");
        employees.put(201, "Rose");
        employees.put(301, "Luka");
        employees.put(401, "Ann");
        employees.put(501, "Mary");

        Iterator<Integer> iterator = employees.keySet().iterator();
        System.out.println("Employee details:>> ");
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = employees.get(key);
            System.out.println(key + ": " + value);
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the employee ID to search: ");
        int emp_id = sc.nextInt();



        if (employees.containsKey(emp_id)) {
            System.out.println("employee detilas :"+emp_id+" : "+employees.get(emp_id));
        }else{
            System.out.println("Employee ID not found");
        }


    }
}
