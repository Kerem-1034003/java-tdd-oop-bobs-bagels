package com.booleanuk.core;

import java.util.List;
import java.util.ArrayList;

public class Bagel implements PricedItem {
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

    private List<Filling> fillings = new ArrayList<>();

    public void addFilling(Filling filling) {
        this.fillings.add(filling);
    }

    public List<Filling> getFillings() {
        return this.fillings;
    }

}