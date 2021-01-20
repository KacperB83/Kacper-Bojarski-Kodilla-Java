package com.kodilla.good.patterns.challenges.Food2Door;


public class Order {
    private User user;
    private String supplierName ;
    private boolean canBeOrdered;

    public Order(User user, String supplierName, boolean canBeOrdered) {
        this.user = user;
        this.supplierName = supplierName;
        this.canBeOrdered = canBeOrdered;
    }
    public User getUser() {
        return user;
    }

    public String getSupplier() {
        return supplierName;
    }

    public boolean canBeOrdered() {
        return canBeOrdered;
    }
}
