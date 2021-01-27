package com.kodilla.good.patterns.challenges.Food2Door;

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
}
