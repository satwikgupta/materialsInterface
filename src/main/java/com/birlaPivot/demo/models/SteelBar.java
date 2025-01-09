package com.birlaPivot.demo.models;

public class SteelBar extends Material {
    private final int units;


    public SteelBar(int price, int margin, int units) {
        super(price, margin);
        this.units = units;
        calculateTotalPrice();
    }

    public void calculateTotalPrice() {
        totalPrices = totalPricePerUnit * units;
    }

    @Override
    public String toString() {
        return "SteelBar {" +
                "units=" + units +
                ", price=" + price +
                ", margin=" + margin +
                ", totalPrices=" + totalPrices +
                '}';
    }
}
