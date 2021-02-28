package com.kodilla.good.patterns.challenges.orderService;

import java.util.Map;

public interface OrderRepository {

    void createOrder(User user, Map<Product, Integer> product, int totalPrice);
}
