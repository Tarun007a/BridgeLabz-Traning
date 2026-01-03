package vehiclerentalsystem;

public class Customer {
    private int customerId;
    private String name;

    // constructor
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Customer Id : " + customerId + " Name : " + name);
    }
}

