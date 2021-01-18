package com.kodilla.good.patterns.challenges.orderService;

public class Order {
    private User user;
    private boolean canBeOrdered;

    public Order(User user, boolean canBeOrdered) {
        this.user = user;
        this.canBeOrdered = canBeOrdered;
    }
    public User getUser() {
        return user;
    }
    public boolean canBeOrdered() {
        return canBeOrdered;
    }
}
