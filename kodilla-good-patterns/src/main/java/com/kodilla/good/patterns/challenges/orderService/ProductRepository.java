package com.kodilla.good.patterns.challenges.orderService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {

    private Map<Product, Integer> products;
    private Map<Product, Integer> orderedProducts = new HashMap<>();
    private List<Integer> totalPrice = new ArrayList<>();

    public ProductRepository (Map<Product, Integer> products){
        this.products = products;
    }

    public Map<Product, Integer> checkAvailability(OrderRequest orderRequest) {

        for (Map.Entry<Product, Integer> orderMap : orderRequest.getProducts().entrySet()) {
            if (products.containsKey(orderMap.getKey())) {
                if (products.get(orderMap.getKey()).intValue() >= orderMap.getValue()) {
                    System.out.println("This " + orderMap.getKey() + " can be ordered.");
                    orderedProducts.put((orderMap.getKey()), orderMap.getValue());
                    totalPrice.add(orderMap.getKey().getPrice());

                } else {
                    System.out.println("We do not have enough items of this product: " + orderMap.getKey());
                }
            } else {
                System.out.println("Sorry, we do not have this product: " + orderMap.getKey() + " in our stock.");

            }
        }
        return orderedProducts;
    }

    public int getTotalPrice() {
        int sum = 0;
        for(int s: totalPrice) {
            sum += s;
        }
        return sum;
    }
}
