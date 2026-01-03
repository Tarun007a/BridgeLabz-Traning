package vehiclerentalsystem;

public class Car extends Vehicle {
    public Car(int vehicleId, String brand) {
        super(vehicleId, brand, 800);
    }

    public int calculateRent(int days) {
        int surcharge = 200;
        return (baseRate * days) + surcharge;
    }
}
