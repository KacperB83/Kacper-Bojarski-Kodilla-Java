package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "j.kowalski@gmail.com");

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(new Product("Extra Flakes","ExtraFoodShop", 5));
        listOfProducts.add(new Product("Extra smoothie", "ExtraFoodShop", 5));
        listOfProducts.add(new Product("Healthy pierogi", "HealthyShop", 5));

        return new OrderRequest(user, listOfProducts);
    }
}
