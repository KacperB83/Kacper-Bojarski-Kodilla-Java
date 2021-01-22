package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Objects;

public class Product {
    private String nameOfProduct;
    private int quantity;

    public Product(String nameOfProduct, int quantity) {
        this.nameOfProduct = nameOfProduct;
        this.quantity = quantity;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return quantity == product.quantity &&
                Objects.equals(nameOfProduct, product.nameOfProduct);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct, quantity);
    }
}
