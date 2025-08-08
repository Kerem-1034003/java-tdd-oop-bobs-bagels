package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Bagel> items;
    private int capacity;

    public Basket() {
        this(5);
    }

    public boolean addItem(Bagel bagel) {
        if (this.items.size() >= this.capacity) {
            return false;
        }
        return this.items.add(bagel);
    }

    public List<Bagel> getItems() {
        return this.items;
    }

    public boolean removeItem(Bagel bagel) {
        return this.items.remove(bagel);
    }

    public Basket(int capacity) {
        this.items = new ArrayList<>();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getTotalCost(){
        double total = 0.0;
        for (Bagel bagel : this.items){
            total += bagel.getPrice();
        }
        return total;
    }

}