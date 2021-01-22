package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.List;

public class Order {
    private User user;
    private String supplierName ;
    private List<Product> products;
    private boolean canBeOrdered;

    public Order(User user, String supplierName, List<Product> products, boolean canBeOrdered) {
        this.user = user;
        this.supplierName = supplierName;
        this.products = products;
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
