package com.artmarketplace;

public abstract class Artwork implements IPurchasable {
    public String title;
    public String artist;
    public double price;
    protected int licenseType;
    public boolean hasPreview;

    public Artwork(String title, String artist, double price, int licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = false;
    }

    public Artwork(String title, String artist, double price, int licenseType, boolean hasPreview) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.hasPreview = hasPreview;
    }

    protected void setLicenseType(int type) {
        licenseType = type;
    }

    public abstract void license(int licenseType);

    public void purchase(User user) {
        if(user.deductBalance(price)) System.out.println("purchased successfully");
        else System.out.println("Insufficient balance");
    }
}

