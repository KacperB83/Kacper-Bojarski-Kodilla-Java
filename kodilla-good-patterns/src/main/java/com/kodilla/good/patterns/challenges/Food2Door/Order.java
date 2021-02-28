package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class Order {

    private User user;
    private String supplierName;
    private Map<Product, Integer> listOfProducts;
    private int totalPrice;

    public Order(User user, Map<Product, Integer> listOfProducts, int sum) {
        this.listOfProducts = listOfProducts;
        this.user = user;
        this.totalPrice = totalPrice;
        this.supplierName = supplierName;
    }

    public User getUser() {
        return user;
    }
}
