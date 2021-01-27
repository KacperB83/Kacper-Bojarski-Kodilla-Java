package com.kodilla.good.patterns.challenges.orderService;

import java.util.List;

public class ProductsOrderedService implements OrderService {

    @Override
    public boolean order(User user, List<Product> products) {
        System.out.println("Order of " + user +" for "+ products.toArray() + " has been created.");
        return true;
    }
}
