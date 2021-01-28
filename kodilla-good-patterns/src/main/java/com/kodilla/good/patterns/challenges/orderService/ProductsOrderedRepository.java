package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashMap;
import java.util.Map;

public class ProductsOrderedRepository implements OrderRepository {
    private Map<User, Map<Product, Integer>> orders = new HashMap<>();

    @Override
    public void createOrder(User user, Map<Product, Integer> products, int totalPrice) {
        orders.put(user, products);
        System.out.println("Order for products : \n" + orders.values().toString()+"\n has been created." + "\n Total price: "+totalPrice);
    }
}
