package com.gamebox;

public class ArcadeGame extends Game {
    public ArcadeGame(String title, double price, double rating) {
        super(title, "Arcade", price, rating);
    }

    public ArcadeGame(String title, double rating) {
        super(title, "Arcade", rating);
    }

    public void download(User user) {
        double finalPrice = applySeasonalOffer(20);
        if(user.buyGame(this, finalPrice)) System.out.println(title + "price " + finalPrice);
        else System.out.println("Not enough balance for " + title);
    }

    public void playDemo() {
        System.out.println("Playing demo of " + title);
    }
}

