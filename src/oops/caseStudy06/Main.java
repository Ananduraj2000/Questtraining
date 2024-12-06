package oops.caseStudy06;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> inventory=new ArrayList<>();
        inventory.add(new Car("TY01","Toyota","Innova",200000, LocalDate.of(2020, 1, 15), 5));
        inventory.add(new Car("HO2", "Honda", "Civic", 25000, LocalDate.of(2021, 5, 20), 5));
        inventory.add(new Car("TY3", "Toyota", "Crysta", 50000, LocalDate.of(2019, 8, 25), 4));
        inventory.add(new Bike("Y01", "Yamaha", "R15", 15000, LocalDate.of(2021, 3, 10), 150));
        inventory.add(new Bike("KW2", "Kawasaki", "Ninja", 20000, LocalDate.of(2020, 11, 5), 250));


        //write  method to print all vehicles from a specific brand using the Stream
        String targetBrand="Toyota";
        System.out.println("Vehicles form brand"+targetBrand+" :");
        inventory.stream()
                .filter(vehicle -> vehicle.getBrand().equalsIgnoreCase(targetBrand))
                .forEach(vehicle -> System.out.println(vehicle));

        Customer customer=new Customer("C01","Don","don1542@gmail.com");

        Map<Customer, Set<Vehicle>> salesMap=new HashMap<>();

        salesMap.put(customer,new HashSet<>());


        try {
            Vehicle selectedVehicle = inventory.get(0);
            if (!inventory.contains(selectedVehicle)) {
                throw new VehicleNotAvailableException("Vehicle not available in inventory.");
            }
            customer.addPurchasedVehicle(selectedVehicle);
            salesMap.get(customer).add(selectedVehicle);
            inventory.remove(selectedVehicle);
        } catch (VehicleNotAvailableException e) {
            System.err.println("Error: " + e.getMessage());
        }


        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("salesData.ser"))) {
            oos.writeObject(salesMap);
            System.out.println("Sales data serialized successfully.");
        } catch (IOException e) {
            System.err.println("error: " + e.getMessage());
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("salesData.ser"))) {
            Map<Customer, Set<Vehicle>> deserializedSalesMap = (Map<Customer, Set<Vehicle>>) ois.readObject();
            System.out.println("Deserialized sales data: " + deserializedSalesMap);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization error: " + e.getMessage());
        }

         //Print purchased vehicles sorted by price

        System.out.println("\nVehicles purchased sorted by price (descending):");
        customer.getPurchasedVehicles().stream()
                .sorted((v1, v2) -> Double.compare(v2.getPrice(), v1.getPrice()))
                .forEach(System.out::println);
    }
}




