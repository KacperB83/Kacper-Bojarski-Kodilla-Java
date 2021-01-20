package com.kodilla.good.patterns.challenges.Food2Door;


public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Jan", "Kowalski", "j.kowalski@gmail.com");

        String nameOfProduct = "Extra Flakes";
        int quantity = 5;

        return new OrderRequest(user, nameOfProduct, quantity);
    }
}
