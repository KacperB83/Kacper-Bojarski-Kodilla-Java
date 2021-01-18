package com.kodilla.good.patterns.challenges.orderService;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "j.kowalski@gmail.com");

        Product product = new Product("Samsung");

        return new OrderRequest(user, product);
    }
}
