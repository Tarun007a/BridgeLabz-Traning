package com.payexpress;

public class ElectricityBill extends Bill {
    public ElectricityBill(double amount, String dueDate) {
        super("Electricity", amount, dueDate);
    }

    public void pay() {
        double total = calculateLateFee(100);
        markPaid();
        System.out.println("Electricity Bill Paid : " + total);
    }

    public void sendReminder() {
        System.out.println("Electricity bill  " + dueDate);
    }
}

