package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Item> items;
    private int capacity;

    public Basket() {
        this(5);
    }

    public boolean addItem(Item item) {
        if (this.items.size() >= this.capacity) {
            return false;
        }
        return this.items.add(item);
    }

    public List<Item> getItems() {
        return this.items;
    }

    public boolean removeItem(Item item) {
        return this.items.remove(item);
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
        for (Item item : this.items){
            total += item.getPrice();

            if (item instanceof Bagel) {
                Bagel bagel = (Bagel) item;
                for (Filling filling : bagel.getFillings()) {
                    total += filling.getPrice();
                }
            }
        }
        return total;
    }
}