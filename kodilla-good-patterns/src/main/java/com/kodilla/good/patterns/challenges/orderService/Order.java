package com.kodilla.good.patterns.challenges.orderService;

import java.util.Map;

public class Order {
    private User user;
    private Map<Product, Integer> listOfProducts;
    private int totalPrice;



    public Order(User user, Map<Product, Integer> listOfProducts, int totalPrice) {
        this.listOfProducts = listOfProducts;
        this.user = user;
        this.totalPrice = totalPrice;
    }
    public User getUser() {
        return user;
    }

}
