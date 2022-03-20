package com.example.mobiles;

public class PHONES {

    private String phoneBrand;
    private int phoneImage;
    private String phoneName;
    private double phonePrice;

    public PHONES(String phoneBrand, int phoneImage, String phoneName, double phonePrice) {
        this.phoneBrand = phoneBrand;
        this.phoneImage = phoneImage;
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
    }

    public String getPhoneBrand() {
        return phoneBrand;
    }

    public void setPhoneBrand(String phoneBrand) {
        this.phoneBrand = phoneBrand;
    }

    public int getPhoneImage() {
        return phoneImage;
    }

    public void setPhoneImage(int phoneImage) {
        this.phoneImage = phoneImage;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public double getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }
}
