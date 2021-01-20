package com.kodilla.good.patterns.challenges.Food2Door;

public interface OrderRepository {
    void createOrder(User user, String nameOfSupplier,  String nameOfProduct, int quantity);
}
