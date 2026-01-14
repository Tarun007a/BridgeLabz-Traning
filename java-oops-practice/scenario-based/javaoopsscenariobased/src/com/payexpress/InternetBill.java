package com.payexpress;

public class InternetBill extends Bill {
    public InternetBill(double amount, String dueDate) {
        super("Internet", amount, dueDate);
    }

    public void pay() {
        double total = calculateLateFee(50);
        markPaid();
        System.out.println("Internet Bill Paid : " + total);
    }

    public void sendReminder() {
        System.out.println("Internet bill " + dueDate);
    }
}

