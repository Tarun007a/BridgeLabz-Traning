package vehiclerentalsystem;

public class Bike extends Vehicle {
    public Bike(int vehicleId, String brand) {
        super(vehicleId, brand, 300);
    }

    public int calculateRent(int days) {
        return baseRate * days;
    }
}

