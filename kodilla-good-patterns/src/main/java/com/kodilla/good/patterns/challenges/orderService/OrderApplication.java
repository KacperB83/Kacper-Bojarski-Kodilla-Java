package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashMap;
import java.util.Map;

public class OrderApplication {
    public static void main(String[] args) {

        Map<Product, Integer> products = new HashMap<>();
        products.put(new Product("Galaxy S9","Samsung", 2300), 5);
        products.put(new Product("LedTv 55'","Sony", 3500), 5);
        products.put(new Product("Portable speaker","JBL", 400), 15);
        products.put(new Product("Head phones","AKG", 300), 25);

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new ProductRepository(products),
                new MailService(), new ProductsOrderedRepository());
        productOrderService.process(orderRequest);
    }
}
