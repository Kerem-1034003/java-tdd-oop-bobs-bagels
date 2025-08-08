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

}