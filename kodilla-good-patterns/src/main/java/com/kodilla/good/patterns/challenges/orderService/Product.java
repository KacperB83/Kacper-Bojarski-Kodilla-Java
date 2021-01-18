package com.kodilla.good.patterns.challenges.orderService;

public class Product {
    private String nameOfProduct;

    public Product(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                '}';
    }
}
