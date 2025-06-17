// Vehicle.java - Abstract class for all vehicles
import java.util.*;

public abstract class Vehicle {
    // ENCAPSULATION: Private fields
    private String vehicleId;
    private String registrationNumber;
    private String model;
    private int year;
    private VehicleType type;
    private boolean isAvailable;
    
    public Vehicle(String vehicleId, String registrationNumber, String model, int year, VehicleType type) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.year = year;
        this.type = type;
        this.isAvailable = true;
    }
    
    // Abstract method that subclasses must implement
    public abstract void displayVehicleDetails();
    public abstract double calculateFuelEfficiency();
    
    // Concrete methods
    public void startEngine() {
        System.out.println(type.getName() + " " + model + " engine started.");
    }
    
    public void stopEngine() {
        System.out.println(type.getName() + " " + model + " engine stopped.");
    }
    
    // Getters and Setters
    public String getVehicleId() {
        return vehicleId;
    }
    
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public VehicleType getType() {
        return type;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
