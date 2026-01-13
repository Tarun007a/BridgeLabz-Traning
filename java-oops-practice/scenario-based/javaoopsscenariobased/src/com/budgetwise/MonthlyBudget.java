package com.budgetwise;

public class MonthlyBudget extends Budget {
    public MonthlyBudget(double income, String[] categories, double[] categoryLimits) {
        super(income, categories, categoryLimits);
    }

    public void generateReport() {
        double expenses = getTotalExpenses();
        double savings = income - expenses;
        System.out.println("Monthly Report");
        System.out.println("Income : " + income);
        System.out.println("Expenses : " + expenses);
        System.out.println("Savings : " + savings);
    }
}
