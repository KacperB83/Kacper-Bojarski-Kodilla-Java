package com.kodilla.good.patterns.challenges.orderService;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski");

        Product product = new Product("Smart Phone");

        return new OrderRequest(user, product);
    }
}
