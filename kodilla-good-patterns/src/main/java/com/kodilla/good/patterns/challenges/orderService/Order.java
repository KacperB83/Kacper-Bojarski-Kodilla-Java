package com.kodilla.good.patterns.challenges.orderService;

import java.util.Map;

public class Order {
    private User user;
    private Map<Product, Integer> listOfProducts;


    public Order(User user, Map<Product, Integer> orderedProducts) {
        this.listOfProducts = listOfProducts;
        this.user = user;
    }
    public User getUser() {
        return user;
    }

}
