package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SupplierOrderRepository implements OrderRepository {

    private Map<User, List<Product>> orders = new HashMap<>();

    @Override
    public void createOrder(User user, List<Product> product) {
        orders.put(user, product);
    }

}
