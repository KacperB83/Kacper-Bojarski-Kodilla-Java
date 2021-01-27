package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashMap;
import java.util.Map;

public class ProductRepository {
    private Map<Product, Integer> products;
    private Map<Product, Integer> orderedProducts = new HashMap<>();

    public ProductRepository (Map<Product, Integer> products){
        this.products = products;
    }

    public boolean checkAvailability(OrderRequest orderRequest) {

            for (Map.Entry<Product, Integer> orderMap : orderRequest.getProducts().entrySet()) {
                if (products.containsKey(orderMap.getKey())) {
                    if (products.get(orderMap.getKey()).intValue() >= orderMap.getValue()) {
                        System.out.println("This " + orderMap.getKey() + " can be ordered.");
                        orderedProducts.put((orderMap.getKey()), orderMap.getValue());
                        continue;

                    } else {
                        System.out.println("We do not have enough items of this product.");
                    }
                } else {
                    System.out.println("Sorry, we do not have this product in our stock.");
                }
        }
        return true;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }

}
