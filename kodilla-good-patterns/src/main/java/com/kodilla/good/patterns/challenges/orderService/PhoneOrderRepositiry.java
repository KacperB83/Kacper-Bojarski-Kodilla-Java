package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneOrderRepositiry implements OrderRepository {
    private Map<User, Product> orders = new HashMap<>();

    @Override
    public void createOrder(User user, Product product) {
        orders.put(user, product);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneOrderRepositiry that = (PhoneOrderRepositiry) o;
        return Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
