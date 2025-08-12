package com.booleanuk.core;

public abstract class Item implements Product {
    protected String sku;
    protected String name;
    protected double price;
    protected String variant;

    public Item(String sku, String name, String variant, double price) {
        this.sku = sku;
        this.name = name;
        this.variant = variant;
        this.price = price;
    }
    @Override
    public String getSku() {
        return sku;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVariant() {
        return variant;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
