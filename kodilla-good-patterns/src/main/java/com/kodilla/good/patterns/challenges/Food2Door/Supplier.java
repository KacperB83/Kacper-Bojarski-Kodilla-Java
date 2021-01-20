package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.HashMap;
import java.util.Map;

public class Supplier {
    private OrderRequest orderRequest;
    private String nameOfSupplier;
    private Map<String , Integer> products = new HashMap<>();

    public Supplier(String nameOfSupplier) {
        this.nameOfSupplier = nameOfSupplier;
    }
    public void addProduct(String nameOfProduct, Integer quantity) {
        if(products.get(nameOfProduct)==null) {
            products.put(nameOfProduct, quantity);
        }
    }
    public boolean canBeOrdered() {
        for(Map.Entry<String, Integer> entry: products.entrySet()) {
            if (entry.getKey().equals(orderRequest.getNameOfProduct())&&
            entry.getValue()> orderRequest.getQuantity()) {
                return true;
            }
        }
        return false;
    }
    public String getNameOfSupplier(){
        return nameOfSupplier;
    }

}
