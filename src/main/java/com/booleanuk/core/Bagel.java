package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Bagel extends Item {
    private double price;
    private List<Filling> fillings = new ArrayList<>();

    public Bagel(String sku, String name, String variant, double price) {
        super(sku, name, variant, price);
        this.price = price;
    }


    @Override
    public double getPrice() {
        return price;
    }

    public void addFilling(Filling filling) {
        fillings.add(filling);
    }

    public List<Filling> getFillings() {
        return fillings;
    }
}
