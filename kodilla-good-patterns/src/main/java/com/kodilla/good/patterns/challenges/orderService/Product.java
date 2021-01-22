package com.kodilla.good.patterns.challenges.orderService;

import java.util.Objects;

public class Product {
    private String nameOfProduct;

    public Product(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                '}';
    }
}
