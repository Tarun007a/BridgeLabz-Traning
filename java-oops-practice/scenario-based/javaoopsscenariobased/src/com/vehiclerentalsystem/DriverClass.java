package vehiclerentalsystem;

public class DriverClass {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "Tarun");

        Vehicle bike = new Bike(0, "Hero");
        Vehicle car = new Car(1, "Honda");
        Vehicle truck = new Truck(2, "Tata");

        customer.displayDetails();

        System.out.println("Bike Rent : " + bike.calculateRent(3));
        System.out.println("Car Rent : " + car.calculateRent(3));
        System.out.println("Truck Rent : " + truck.calculateRent(3));
    }
}

