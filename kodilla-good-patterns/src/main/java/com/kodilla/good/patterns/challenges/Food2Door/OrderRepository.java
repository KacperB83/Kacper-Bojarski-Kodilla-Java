package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public interface OrderRepository {

    void createOrder(User user, Map<Product, Integer> product, int sum);
}
