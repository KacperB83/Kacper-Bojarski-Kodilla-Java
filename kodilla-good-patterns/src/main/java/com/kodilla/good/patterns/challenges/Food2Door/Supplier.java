package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.*;

public class Supplier {
    private OrderRequest orderRequest;
    private String nameOfSupplier;
    private List<Product> products = new ArrayList<>();

    public Supplier(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }

    public void addProduct(Product product) {
        if(!products.contains(product.getNameOfProduct())) {
            products.add(product);
        }
    }
    public boolean canBeOrdered() {
        for(Product p: products) {
            if (orderRequest.getListOfProducts().contains(p.getNameOfProduct())) {
                return true;
            }
        }
        return false;
    }
    public String getNameOfSupplier(){
        return nameOfSupplier;
    }
}
