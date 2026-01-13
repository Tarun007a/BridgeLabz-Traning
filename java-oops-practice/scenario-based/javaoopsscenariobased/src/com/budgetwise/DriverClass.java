package com.budgetwise;

public class DriverClass {
    public static void main(String[] args) {
        String[] catigories = { "Food", "Travel", "Shopping" };
        double[] monthlyLimits = {3000, 2000, 1500};
        double[] yearlyLimits = {36000, 24000, 18000};

        Budget month = new MonthlyBudget(10000, catigories, monthlyLimits);
        Budget year = new AnnualBudget(120000, catigories, yearlyLimits);

        month.addExpense(new Transaction(1200, "EXPENSE", "01-02", "Food"));
        month.addExpense(new Transaction(2500, "EXPENSE", "05-02", "Travel"));
        month.addExpense(new Transaction(2000, "EXPENSE", "10-02", "Shopping"));

        month.generateReport();
        month.detectOverspend();

        year.addExpense(new Transaction(40000, "EXPENSE", "2026", "Food"));
        year.addExpense(new Transaction(26000, "EXPENSE", "2026", "Travel"));

        year.generateReport();
        year.detectOverspend();
    }
}

