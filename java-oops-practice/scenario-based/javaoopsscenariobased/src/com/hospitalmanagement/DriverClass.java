package hospitalmanagement;

public class DriverClass {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Aman", 5);
        Patient p2 = new OutPatient(2, "Tarun", 3);

        Doctor d1 = new Doctor(0, "Doctor", "Dept");

        Bill bill = new Bill(20000);

        p1.displayInfo();
        p2.displayInfo();
        d1.displayInfo();

        System.out.println("Total Bill : " + bill.calculatePayment());
    }
}
