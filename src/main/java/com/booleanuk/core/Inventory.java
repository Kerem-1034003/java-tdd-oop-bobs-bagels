package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Item> stock;

    public Inventory() {
        this.stock = new HashMap<>();
        stock.put("BGLO", new Bagel("BGLO", "Bagel", "Onion", 0.49));
        stock.put("BGLP", new Bagel("BGLP", "Bagel", "Plain", 0.39));
        stock.put("BGLE", new Bagel("BGLE", "Bagel", "Everything", 0.49));
        stock.put("BGLS", new Bagel("BGLS", "Bagel", "Sesame", 0.49));
        stock.put("COFB", new Bagel("COFB", "Coffee", "Black", 0.99));
        stock.put("COFW", new Bagel("COFW", "Coffee", "White", 1.19));
        stock.put("COFC", new Bagel("COFC", "Coffee", "Capuccino", 1.29));
        stock.put("COFL", new Bagel("COFL", "Coffee", "Latte", 1.29));
        stock.put("FILB", new Filling("FILB", "Bacon", 0.12));
        stock.put("FILE", new Filling("FILE", "Egg", 0.12));
        stock.put("FILC", new Filling("FILC", "Cheese", 0.12));
        stock.put("FILX", new Filling("FILX", "Cream Cheese", 0.12));
        stock.put("FILS", new Filling("FILS", "Smoked Salmon", 0.12));
        stock.put("FILH", new Filling("FILH", "Ham", 0.12));
    }

    public double getPriceBySku(String sku) {
        Item item = stock.get(sku);
        if (item != null) {
            return item.getPrice();
        }
        throw new IllegalArgumentException("Item not found in inventory");
    }
}
