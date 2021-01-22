package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.*;

public class SupplierRepository {
    private List<Supplier> suppliers = new ArrayList<>();

    public SupplierRepository(){

        Supplier extraFoodShop = new Supplier("ExtraFoodShop");
        extraFoodShop.addProduct(new Product("Extra Flakes", 10));
        extraFoodShop.addProduct(new Product("Extra candies", 100));
        extraFoodShop.addProduct(new Product("Extra chocolate bar", 100));
        extraFoodShop.addProduct(new Product("Extra smoothie", 100));
        suppliers.add(extraFoodShop);

        Supplier healthyShop = new Supplier("HealthyShop");
        healthyShop.addProduct(new Product("Healthy noodles", 15));
        healthyShop.addProduct(new Product("Healthy pierogi", 25));
        healthyShop.addProduct(new Product("Healthy potatoes", 10));
        suppliers.add(healthyShop);

        Supplier glutenFreeShop = new Supplier("GlutenFreeShop");
        glutenFreeShop.addProduct(new Product("GF bread", 15));
        glutenFreeShop.addProduct(new Product("GF baguette", 25));
        glutenFreeShop.addProduct(new Product("GF chocolate cake", 10));
        glutenFreeShop.addProduct(new Product("GF nachos", 35));
        suppliers.add(glutenFreeShop);
    }
    public boolean checkAvailability() {
        for (Supplier s : suppliers) {
            if (s.canBeOrdered()) {
                return true;
            }
        }
        return false;
    }
}
