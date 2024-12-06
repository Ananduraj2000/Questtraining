package oops.caseStudy06;

import java.io.Serializable;
import java.time.LocalDate;

public class Vehicle implements Cloneable, Serializable {

   private String vehicleId ;
    private String brand ;
    private String model;
    private double price;
    private LocalDate manufactureDate;

    public Vehicle(String vehicleId, String brand, String model, double price, LocalDate manufactureDate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.manufactureDate = manufactureDate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", manufactureDate=" + manufactureDate +
                '}';
    }

    //Implement Cloneable in the Vehicle class to create a discounted copy of a vehicle with 10% off the price.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Vehicle cloned= (Vehicle) super.clone();
        cloned.setPrice(this.price * 0.9);
        return cloned;
    }
}
