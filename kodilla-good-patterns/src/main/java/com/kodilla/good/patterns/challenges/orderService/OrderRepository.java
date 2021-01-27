package com.kodilla.good.patterns.challenges.orderService;

import org.w3c.dom.ls.LSOutput;

import java.util.Map;

public interface OrderRepository {
    void createOrder(User user, Map<Product, Integer> product);

}
