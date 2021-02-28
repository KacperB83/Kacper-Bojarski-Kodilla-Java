package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class SupplierOrderRepository implements OrderRepository {

    private Map<User, Map<Product, Integer>> orders = new HashMap<>();

    @Override
    public void createOrder(User user, Map<Product, Integer> product, int sum) {
        orders.put(user, product);
        System.out.println("Order for products : \n" + orders.values().toString()+"\n has been created." + "\n Total price: "+sum);

    }

}
