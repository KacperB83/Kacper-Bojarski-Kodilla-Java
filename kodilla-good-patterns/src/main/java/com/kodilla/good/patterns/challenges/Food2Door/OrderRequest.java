package com.kodilla.good.patterns.challenges.Food2Door;


public class OrderRequest {
        private User user;
        private String nameOfProduct;
        private int quantity;

        public OrderRequest(User user, String nameOfProduct, int quantity) {
            this.user = user;
            this.nameOfProduct = nameOfProduct;
            this.quantity = quantity;
        }

        public User getUser() {
            return user;
        }

        public String getNameOfProduct() {
            return nameOfProduct;
        }

        public int getQuantity() {
            return quantity;
        }
}

