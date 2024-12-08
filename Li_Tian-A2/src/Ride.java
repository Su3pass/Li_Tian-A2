public class Ride {
    private String rideName;
    private int capacity;
    private Employee rideOperator;  // Employee to operate the ride

    // Default constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.capacity = 0;
        this.rideOperator = null;
    }

    // Constructor with parameters
    public Ride(String rideName, int capacity, Employee rideOperator) {
        this.rideName = rideName;
        this.capacity = capacity;
        this.rideOperator = rideOperator;
    }

    // Getters and setters
    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Employee getRideOperator() {
        return rideOperator;
    }

    public void setRideOperator(Employee rideOperator) {
        this.rideOperator = rideOperator;
    }
}
