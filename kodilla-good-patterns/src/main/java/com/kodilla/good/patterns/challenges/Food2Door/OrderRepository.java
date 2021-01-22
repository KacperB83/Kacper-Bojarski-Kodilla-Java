package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public interface OrderRepository {
    void createOrder(User user, List<Product> products);
}
