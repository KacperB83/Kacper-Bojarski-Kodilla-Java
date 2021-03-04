package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public class OrderRequestRetriever {

    private User user;
    private Map<Product, Integer> listOfProducts;

    public OrderRequestRetriever(User user, Map<Product, Integer> listOfProducts) {
        this.user = user;
        this.listOfProducts = listOfProducts;
    }

    public OrderRequest retrieve() {
        return new OrderRequest(user, listOfProducts);
    }
}
