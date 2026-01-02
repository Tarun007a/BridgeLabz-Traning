package vehiclerentalsystem;

public abstract class Vehicle implements Rentable {
    protected int vehicleId;
    protected String brand;
    protected int baseRate;

    // constructor
    public Vehicle(int vehicleId, String brand, int baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // getter and setter
    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }
}

