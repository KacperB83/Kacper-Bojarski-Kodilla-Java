package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class SupplierOrderRepository implements OrderRepository {

    private Map<User, List<Product>> orders = new HashMap<>();

    @Override
    public void createOrder(User user, List<Product> product) {
        orders.put(user, product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SupplierOrderRepository that = (SupplierOrderRepository) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
