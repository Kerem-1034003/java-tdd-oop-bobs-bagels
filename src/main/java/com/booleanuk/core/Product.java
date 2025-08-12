package com.booleanuk.core;

public interface Product extends PricedItem{
    String getSku();
    String getName();
    String getVariant();
}
