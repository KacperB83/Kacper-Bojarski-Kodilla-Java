package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public interface OrderRepository {
    void createOrder(User user, String supplierName, Map<Product, Integer> products, int totalPrice);
}
