package com.gamebox;

public class StrategyGame extends Game {
    public StrategyGame(String title, double price, double rating) {
        super(title, "Strategy", price, rating);
    }

    public StrategyGame(String title, double rating) {
        super(title, "Strategy", rating);
    }

    public void download(User user) {
        double finalPrice = applySeasonalOffer(10);
        if(user.buyGame(this, finalPrice)) System.out.println(title + " price " + finalPrice);
        else System.out.println("Not enough balance for " + title);
    }

    public void playDemo() {
        System.out.println("Playing demo of " + title);
    }
}

