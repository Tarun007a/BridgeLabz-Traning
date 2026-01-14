package com.payexpress;

public abstract class Bill implements IPayable {
    public String type;
    public double amount;
    public String dueDate;
    private boolean isPaid;

    public Bill(String type, double amount, String dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    protected void markPaid() {
        isPaid = true;
    }

    public boolean isPaid() {
        return isPaid;
    }

    protected double calculateLateFee(double penalty) {
        return amount + penalty;
    }
}
