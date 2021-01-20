package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.*;

public class SupplierRepository {
    private List<Supplier> suppliers = new ArrayList<>();

    public SupplierRepository(){

        Supplier extraFoodShop = new Supplier("ExtraFoodShop");
        extraFoodShop.addProduct("Extra Flakes", 10);
        extraFoodShop.addProduct("Extra candies", 100);
        extraFoodShop.addProduct("Extra chocolate bar", 100);
        extraFoodShop.addProduct("Extra smoothie", 100);

        suppliers.add(extraFoodShop);

        Supplier healthyShop = new Supplier("HealthyShop");
        healthyShop.addProduct("Healthy noodles", 15);
        healthyShop.addProduct("Healthy pierogi", 25);
        healthyShop.addProduct("Healthy potatoes", 10);
        suppliers.add(healthyShop);

        Supplier glutenFreeShop = new Supplier("GlutenFreeShop");
        glutenFreeShop.addProduct("GF bread", 15);
        glutenFreeShop.addProduct("GF baguette", 25);
        glutenFreeShop.addProduct("GF chocolate cake", 10);
        glutenFreeShop.addProduct("GF nachos", 35);
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
