package com.artmarketplace;

public class PrintArt extends Artwork {
    public PrintArt(String title, String artist, double price, int licenseType) {
        super(title, artist, price, licenseType);
    }

    public void license(int licenseType) {
        setLicenseType(licenseType);
        if(licenseType == 1) System.out.println("PrintArt license type 1");
        else if(licenseType == 2) System.out.println("PrintArt license type 2");
    }
}
