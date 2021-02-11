package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class SupplierOrderRepository implements OrderRepository {

    private Map<User, Map<Product, Integer>> orders = new HashMap<>();

    @Override
    public void createOrder(User user, String supplierName, Map<Product, Integer> product, int totalPrice) {
        orders.put(user, product);
        System.out.println("Order from "+ supplierName + " for products : \n" + orders.values().toString()+"\n has been created." + "\n Total price: "+totalPrice);

    }

}
