package oops.caseStudy06;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer implements Serializable {
    private String customerId ;
    private String name;
    private String email;
    private List<Vehicle> purchasedVehicles;
    private Map<Vehicle, LocalDateTime> purchasedDateTime;

    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.purchasedVehicles = new ArrayList<>();
        this.purchasedDateTime = new HashMap<>();
    }

    public void addPurchasedVehicle(Vehicle vehicle) {
        purchasedVehicles.add(vehicle);
        purchasedDateTime.put(vehicle, LocalDateTime.now());
    }

    public List<Vehicle> getPurchasedVehicles() {
        return purchasedVehicles;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", purchasedVehicles=" + purchasedVehicles +
                ", purchasedDateTime=" + purchasedDateTime +
                '}';
    }
}
