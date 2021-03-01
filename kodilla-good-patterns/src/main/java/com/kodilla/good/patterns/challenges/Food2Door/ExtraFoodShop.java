package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraFoodShop implements ProducerMultiplier {

    private String supplierName;
    private Map<Product, Integer> products;
    private Map<Product, Integer> orderedProducts = new HashMap<>();
    private List<Integer> totalPrice = new ArrayList<>();

    public ExtraFoodShop(String supplierName, Map<Product, Integer> extraFoodShopMap) {
        this.supplierName = supplierName;
        this.products = extraFoodShopMap;
    }

    @Override
    public Map<Product, Integer> process(OrderRequest orderRequest) {

        for (Map.Entry<Product, Integer> orderMap : orderRequest.getProducts().entrySet()) {
            if (products.containsKey(orderMap.getKey())) {
                if (products.get(orderMap.getKey()).intValue() >= orderMap.getValue()) {
                    System.out.println("This " + orderMap.getKey() + " can be ordered.");
                    orderedProducts.put((orderMap.getKey()), orderMap.getValue());
                    totalPrice.add(orderMap.getKey().getPrice());
                } else {
                    System.out.println("We do not have enough items of this product: " + orderMap.getKey());
                }
            }
        }
        return orderedProducts;
    }

    @Override
    public int getValue() {
        int sum = 0;
        for (int s : totalPrice) {
            sum += s;
        }
        return sum;
    }

    public String getSupplierName() {
        return supplierName;
    }
}
