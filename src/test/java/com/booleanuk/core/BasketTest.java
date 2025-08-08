package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;

public class BasketTest {
    @Test
    public void testAddBagelToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel("BGLO", "Bagel", "Onion", 0.49);

        boolean added = basket.addItem(bagel);

        Assertions.assertTrue(added);
        Assertions.assertEquals(1, basket.getItems().size());
        Assertions.assertEquals("Onion", basket.getItems().get(0).getVariant());
    }

    @Test
    public void testRemoveBagelFromBasket() {
        Basket basket = new Basket();
        Bagel bagel1 = new Bagel("BGLO", "Bagel", "Onion", 0.49);
        Bagel bagel2 = new Bagel("BGLP", "Bagel", "Plain", 0.39);

        basket.addItem(bagel1);
        basket.addItem(bagel2);

        boolean removed = basket.removeItem(bagel1);

        Assertions.assertTrue(removed);
        Assertions.assertEquals(1, basket.getItems().size());
        Assertions.assertEquals("Plain", basket.getItems().get(0).getVariant());
    }

    @Test
    public void testBasketIsFull() {
        Basket basket = new Basket(2);
        Bagel bagel1 = new Bagel("BGLO", "Bagel", "Onion", 0.49);
        Bagel bagel2 = new Bagel("BGLP", "Bagel", "Plain", 0.39);
        Bagel bagel3 = new Bagel("BGLE", "Bagel", "Everything", 0.49);

        Assertions.assertTrue(basket.addItem(bagel1));
        Assertions.assertTrue(basket.addItem(bagel2));
        Assertions.assertFalse(basket.addItem(bagel3));
    }

    @Test
    public void testChangeBasketCapacity() {
        Basket basket = new Basket();

        Assertions.assertEquals(5, basket.getCapacity());

        basket.setCapacity(10);

        Assertions.assertEquals(10, basket.getCapacity());
    }

    @Test
    public void testRemoveNonexistentBagelFromBasket() {
        Basket basket = new Basket();
        Bagel onionBagel  = new Bagel("BGLO", "Bagel", "Onion", 0.49);
        Bagel plainBagel = new Bagel("BGLP", "Bagel", "Plain", 0.39);

        basket.addItem(onionBagel);
        boolean result = basket.removeItem(plainBagel);

        Assertions.assertFalse(result);
        Assertions.assertEquals(1, basket.getItems().size());
    }

    @Test
    public void testGetTotalCostBasket(){
        Basket basket = new Basket();

        Bagel bagel1 = new Bagel("BGLO", "Bagel", "Onion", 0.49);
        Bagel bagel2 = new Bagel("BGLP", "Bagel", "Plain", 0.39);
        Bagel bagel3 = new Bagel("BGLE", "Bagel", "Everything", 0.49);
        Bagel bagel4 = new Bagel("BGLS","Bagel",	"Sesame",0.49);

        basket.addItem(bagel1);
        basket.addItem(bagel2);
        basket.addItem(bagel3);
        basket.addItem(bagel4);

        double total = basket.getTotalCost();

        Assertions.assertEquals(1.86, total, 0.001);

    }

    @Test
    public void testGetBagelPriceFromInventory() {
        Inventory inventory = new Inventory();
        double price = inventory.getPriceBySku("BGLO"); // Onion Bagel

        Assertions.assertEquals(0.49, price, 0.001);
    }

    @Test
    public void testCannotAddMoreThanCapacity() {
        Basket basket = new Basket(2); // max 2 items
        Bagel bagel1 = new Bagel("BGLO", "Bagel", "Onion", 0.49);
        Bagel bagel2 = new Bagel("BGLP", "Bagel", "Plain", 0.39);
        Bagel bagel3 = new Bagel("BGLE", "Bagel", "Everything", 0.49);

        Assertions.assertTrue(basket.addItem(bagel1));
        Assertions.assertTrue(basket.addItem(bagel2));
        Assertions.assertFalse(basket.addItem(bagel3)); // capacity exceeded

        Assertions.assertEquals(2, basket.getItems().size());
    }

    @Test
    public void testGetFillingPriceBeforeAdding() {
        Filling bacon = new Filling("FILB", "Bacon", 0.12);
        Assertions.assertEquals("Bacon", bacon.getName());
        Assertions.assertEquals(0.12, bacon.getPrice());
        Assertions.assertEquals("FILB", bacon.getSku());
    }

}