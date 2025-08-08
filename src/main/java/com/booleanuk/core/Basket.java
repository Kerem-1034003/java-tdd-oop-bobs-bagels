package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Bagel> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(Bagel bagel) {
        return this.items.add(bagel);
    }

    public List<Bagel> getItems() {
        return this.items;
    }
}