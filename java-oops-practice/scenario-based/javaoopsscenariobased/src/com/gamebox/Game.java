package com.gamebox;

public abstract class Game implements IDownloadable {
    public String title;
    public String genre;
    public double price;
    public double rating;

    public Game(String title, String genre, double price, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
    }

    public Game(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.price = 0;
        this.rating = rating;
    }

    protected double applySeasonalOffer(double percent) {
        return price - (price * percent / 100);
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}

