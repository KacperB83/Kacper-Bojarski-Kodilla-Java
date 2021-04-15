package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        String extraFoodShop = "ExtraFoodShop";
        Map<Product, Integer> extraFoodShopMap = new HashMap<>();
        extraFoodShopMap.put(new Product("Extra Flakes", "ExtraFoodShop", 5), 100);
        extraFoodShopMap.put(new Product("Extra candies", "ExtraFoodShop", 5), 50);
        extraFoodShopMap.put(new Product("Extra chocolate bar", "ExtraFoodShop", 5), 100);
        extraFoodShopMap.put(new Product("Extra smoothie", "ExtraFoodShop", 5), 50);

        String glutenFreeShop = "GlutenFreeShop";
        Map<Product, Integer> glutenFreeShopMap = new HashMap<>();
        glutenFreeShopMap.put(new Product("GF bread", "GlutenFreeShop", 15), 100);
        glutenFreeShopMap.put(new Product("GF baguette", "GlutenFreeShop", 25), 100);
        glutenFreeShopMap.put(new Product("GF chocolate cake", "GlutenFreeShop", 10), 10);
        glutenFreeShopMap.put(new Product("GF nachos", "GlutenFreeShop", 35), 50);

        String healthyShop = "HealthyShop";
        Map<Product, Integer> healthyShopMap = new HashMap<>();
        healthyShopMap.put(new Product("Healthy noodles", "HealthyShop", 5), 50);
        healthyShopMap.put(new Product("Healthy pierogi", "HealthyShop", 5), 100);
        healthyShopMap.put(new Product("Healthy potatoes", "HealthyShop", 10), 5);

        List<ProducerMultiplier> producers = new ArrayList<>();
        producers.add(new ExtraFoodShop(extraFoodShop, extraFoodShopMap));
        producers.add(new GlutenFreeShop(glutenFreeShop, glutenFreeShopMap));
        producers.add(new HealthyShop(healthyShop, healthyShopMap));

        User user = new User("Jan", "Kowalski", "j.kowalski@gmail.com");

        Map<Product, Integer> listOfOrderedProducts = new HashMap<>();
        listOfOrderedProducts.put(new Product("Extra Flakes", "ExtraFoodShop", 5), 5);
        listOfOrderedProducts.put(new Product("Extra smoothie", "ExtraFoodShop", 5), 5);
        listOfOrderedProducts.put(new Product("Healthy pierogi", "HealthyShop", 5), 10);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever(user, listOfOrderedProducts);
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService orderService = new OrderService(
                producers,
                new MailService(), new SupplierOrderRepository());
        orderService.processOrders(orderRequest);
    }
}
