package com.budgetwise;

public abstract class Budget implements IAnalyzable {
    public double income;
    protected String[] categories;
    public double[] categoryLimits;
    private Transaction[] transactions;
    private int count;

    public Budget(double income, String[] categories, double[] categoryLimits) {
        this.income = income;
        this.categories = categories;
        this.categoryLimits = categoryLimits;
        this.transactions = new Transaction[100];
        this.count = 0;
    }

    public void addExpense(Transaction t) {
        if(t.getType().equals("EXPENSE")) {
            transactions[count++] = t;
        }
    }

    protected double getTotalExpenses() {
        double total = 0;
        for(int i = 0; i < count; i++) {
            total += transactions[i].getAmount();
        }
        return total;
    }

    protected double getCategoryTotal(String category) {
        double total = 0;
        for(int i = 0; i < count; i++) {
            if(transactions[i].getCategory().equals(category)) {
                total += transactions[i].getAmount();
            }
        }
        return total;
    }

    public void detectOverspend() {
        for(int i = 0; i < categories.length; i++) {
            double spent = getCategoryTotal(categories[i]);
            if(spent > categoryLimits[i]) {
                System.out.println(categories[i] + " by " + (spent - categoryLimits[i]));
            }
        }
    }
}

