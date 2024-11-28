package oops.telecomManagement;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bill bill = new Bill();
        Scanner sc = new Scanner(System.in);

        System.out.println();
        while (true) {
            System.out.println("1.Add Subscriber");
            System.out.println("2.List Subscriber");
            System.out.println("3.Update Balance");
            System.out.println("4.Record call");
            System.out.println("5.Display call history");
            System.out.println("6.Generate Bill");
            System.out.println("7.Exit");
            System.out.println("\nEnter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the details >>>");

                    System.out.print("Enter the id: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter the phone number: ");
                    int phoneNo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter the plan type: ");
                    String planType = sc.nextLine();
                    System.out.print("Enter the balance: ");
                    double balance = sc.nextDouble();
                    sc.nextLine();
                    bill.addSubscriber(new Subscriber(id, name, phoneNo, planType, balance));
                    break;

                case 2:
                    bill.listSubscribers();
                    break;

                case 3:
                    System.out.println("Enter id and new balance");
                    id = sc.nextInt();
                    double newBalance = sc.nextDouble();
                    bill.updateBalance(id, newBalance);

                case 4:
                    System.out.println("Enter call record details:");
                    System.out.print("Enter subscriber id: ");
                    int s_id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter call type (Local/STD/ISD): ");
                    String callType = sc.nextLine();
                    System.out.print("Enter duration : ");
                    int duration = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter call date : ");
                    LocalDateTime date = LocalDateTime.parse(sc.nextLine());
                    //LocalDateTime dates=
                    bill.callRecord(new CallHistory(s_id, callType, duration, date));
                    break;

                case 5:
                    System.out.println("Enter id for displaying detials");
                    id = sc.nextInt();
                    bill.displayCallHistory(id);
                    break;

                case 6:
                    System.out.println("Enter id for generating bill");
                    id = sc.nextInt();
                    bill.generateBill(id);
                    break;

                case 7:
                    bill.saveData();
                    System.out.println("Exiting..........");
                    break;

                    default:
                        System.out.println("Invalid choice!!! Try Again..");

            }
        }


    }
}
