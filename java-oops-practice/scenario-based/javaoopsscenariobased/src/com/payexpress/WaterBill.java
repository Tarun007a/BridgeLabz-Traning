package com.payexpress;

public class WaterBill extends Bill {
    public WaterBill(double amount, String dueDate) {
        super("Water", amount, dueDate);
    }

    public void pay() {
        double total = calculateLateFee(50);
        markPaid();
        System.out.println("Water Bill Paid : " + total);
    }

    public void sendReminder() {
        System.out.println("Water bill " + dueDate);
    }
}
