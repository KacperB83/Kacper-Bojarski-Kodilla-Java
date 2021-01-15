package com.kodilla.good.patterns.challenges.orderService;

public interface OrderRepository {
    void createOrder(User user, Product product);
}
