package com.kodilla.good.patterns.challenges.orderService;

public class PhoneOrderService implements OrderService {

    @Override
    public boolean order(User user, Product product) {
        System.out.println("Order : " + user +" "+ product+ " has been created.");
        return true;
    }
}
