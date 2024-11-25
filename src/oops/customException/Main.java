package oops.customException;

import javax.net.ssl.ManagerFactoryParameters;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        Manager manager = null;

        System.out.println("\nEnter employee details--------");
        while (employee == null) {
            try {
                System.out.print("\nEnter name : ");
                String name = sc.nextLine();
                System.out.print("\nEnter age : ");
                int age = sc.nextInt();
                System.out.print("\nEnter Salary : ");
                double salary = sc.nextDouble();
                employee = new Employee(name, age, salary);
            } catch (InputMismatchException e) {
                System.out.println("Invalid input type." + e.getMessage());
                sc.nextLine();
            } catch (InvalidInputException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("\nEnter manager details :");
        while (manager == null) {
            try {
                System.out.println("\nEnter name :");
                String name = sc.nextLine();
                System.out.println("\nEnter age : ");
                int age = sc.nextInt();
                System.out.println("\nEnter Salary : ");
                double salary = sc.nextDouble();
                System.out.println("\nEnter team size :");
                int teamSize = sc.nextInt();
                manager = new Manager(name, age, salary, teamSize);
            }catch (InputMismatchException e){
                System.out.println("Invalid input type." + e.getMessage());
            }catch (InvalidInputException e){
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }catch (IllegalArgumentException e){
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Employee details:");
        employee.display();
        System.out.println();
        System.out.println("Manager details:");
        manager.display();
        System.out.println(manager);

    }
}
