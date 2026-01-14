package com.payexpress;

public class DriverClass {
    public static void main(String[] args) {
        Bill[] bills = {
            new ElectricityBill(1200, "10-03-2026"),
            new WaterBill(400, "12-03-2026"),
            new InternetBill(999, "15-03-2026")
        };

        for(int i = 0; i < bills.length; i++) {
            bills[i].sendReminder();
            bills[i].pay();
            System.out.println();
        }
    }
}

