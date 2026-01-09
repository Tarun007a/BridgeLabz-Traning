package com.artmarketplace;

public class DriverClass {
    public static void main(String[] args) {
        User user = new User("User", 2000);

        Artwork art1 = new DigitalArt("Art 1", "Artist 1", 1000, 1);
        Artwork art2 = new PrintArt("Art 2", "Artist 2", 2000, 2);

        user.showBalance();

        art1.license(1);
        art1.purchase(user);

        art2.license(2);
        art2.purchase(user);

        user.showBalance();
    }
}

