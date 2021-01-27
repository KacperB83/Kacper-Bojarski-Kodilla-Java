package com.kodilla.good.patterns.challenges.orderService;

import java.util.Objects;

public class Product {
    private String nameOfProduct;
    private String nameOfProducer;
    private int price;

    public Product(String nameOfProduct, String nameOfProducer, int price) {
        this.nameOfProduct = nameOfProduct;
        this.nameOfProducer = nameOfProducer;
        this.price = price;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public String getNameOfProducer() {
        return nameOfProducer;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price &&
                Objects.equals(nameOfProduct, product.nameOfProduct) &&
                Objects.equals(nameOfProducer, product.nameOfProducer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfProduct, nameOfProducer, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "nameOfProduct='" + nameOfProduct + '\'' +
                ", nameOfProducer='" + nameOfProducer + '\'' +
                ", price=" + price +
                '}';
    }
}
