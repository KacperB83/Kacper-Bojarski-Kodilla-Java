package com.kodilla.good.patterns.challenges.orderService;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductRepository {

    private Map<Product, Integer> products = new HashMap<>();

    public ProductRepository (){
        products.put(new Product("Samsung"), 5);
        products.put(new Product("LG"), 3);
        products.put(new Product("Iphone"), 5);
        products.put(new Product("Sony"), 5);
    }
    public boolean checkAvailability(Product product) {
        if(products.containsKey(product.getNameOfProduct())) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepository that = (ProductRepository) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
