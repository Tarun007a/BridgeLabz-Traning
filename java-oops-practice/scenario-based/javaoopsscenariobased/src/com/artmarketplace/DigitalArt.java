package com.artmarketplace;

public class DigitalArt extends Artwork {
    public DigitalArt(String title, String artist, double price, int licenseType) {
        super(title, artist, price, licenseType);
    }

    public void license(int licenseType) {
        setLicenseType(licenseType);
        if(licenseType == 1)System.out.println("DigitalArt license type 1");
        else if(licenseType == 2) System.out.println("DigitalArt license tyep 2");
    }
}
