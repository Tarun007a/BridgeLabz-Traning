package com.budgetwise;

public class AnnualBudget extends Budget {
    public AnnualBudget(double income, String[] categories, double[] categoryLimits) {
        super(income, categories, categoryLimits);
    }

    public void generateReport() {
        double expenses = getTotalExpenses();
        double savings = income - expenses;
        System.out.println("Annual Report");
        System.out.println("Total Income : " + income);
        System.out.println("Total Expenses : " + expenses);
        System.out.println("Net Savings : " + savings);
    }
}

