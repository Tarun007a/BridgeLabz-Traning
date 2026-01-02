package vehiclerentalsystem;

public class Truck extends Vehicle {
    public Truck(int vehicleId, String brand) {
        super(vehicleId, brand, 1200);
    }

    public int calculateRent(int days) {
        int surcharge = days * 150;
        return (baseRate * days) + surcharge;
    }
}

