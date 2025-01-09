package com.birlaPivot.demo.models;

public class Cement extends Material {
    private final int numberOfBags;

    public Cement(int price, int margin, int numberOfBags) {
        super(price, margin);
        this.numberOfBags = numberOfBags;
        calculateTotalPrice();
    }

    public void calculateTotalPrice() {
        totalPrices = totalPricePerUnit * numberOfBags;
    }

    @Override
    public String toString() {
        return "Cement {" +
                "numberOfBags=" + numberOfBags +
                ", price=" + price +
                ", margin=" + margin +
                ", totalPrice=" + totalPrices +
                '}';
    }
}
