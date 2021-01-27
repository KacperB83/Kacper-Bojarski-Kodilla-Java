package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashMap;
import java.util.Map;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "j.kowalski@gmail.com");

        Map<Product, Integer> listOfProducts = new HashMap<>();
        listOfProducts.put(new Product("Galaxy S9","Samsung", 2300), 1);
        listOfProducts.put(new Product("LedTv 55'","Sony", 3500), 1);
        listOfProducts.put(new Product("Portable speaker","JBL", 400), 100);
        listOfProducts.put(new Product("Portable","JBL", 400), 100);


        return new OrderRequest(user, listOfProducts);
    }
}
