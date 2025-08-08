package com.booleanuk.core;

public class Bagel {
    private String sku;
    private String name;
    private String variant;
    private double price;

    public Bagel(String sku, String name, String variant, double price) {
        this.sku = sku;
        this.name = name;
        this.variant = variant;
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getVariant() {
        return variant;
    }

    public double getPrice() {
        return price;
    }
}