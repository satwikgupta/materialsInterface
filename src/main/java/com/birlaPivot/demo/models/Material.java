package com.birlaPivot.demo.models;

public abstract class Material {
    protected int price;
    protected int margin;
    protected int totalPricePerUnit;
    protected int totalPrices;

    public Material(int price, int margin) {
        this.price = price;
        this.margin = margin;
        this.totalPricePerUnit = price + margin;
    }

    int getTotalPrices(){
        return totalPrices;
    }
    int getTotalPricePerBag(){
        return price + margin;
    };
}
