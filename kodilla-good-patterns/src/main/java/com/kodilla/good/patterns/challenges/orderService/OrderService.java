package com.kodilla.good.patterns.challenges.orderService;

import java.util.List;

public interface OrderService {
    boolean order(User user, List<Product> products);
}
