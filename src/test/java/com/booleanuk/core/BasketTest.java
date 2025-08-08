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
}