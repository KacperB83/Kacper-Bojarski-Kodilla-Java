package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        Supplier extraFoodShop = new Supplier("ExtraFoodShop");
        extraFoodShop.addProduct(new Product("Extra Flakes", "ExtraFoodShop", 10));
        extraFoodShop.addProduct(new Product("Extra candies", "ExtraFoodShop",  100));
        extraFoodShop.addProduct(new Product("Extra chocolate bar", "ExtraFoodShop", 100));
        extraFoodShop.addProduct(new Product("Extra smoothie", "ExtraFoodShop", 100));

        Supplier healthyShop = new Supplier("HealthyShop");
        healthyShop.addProduct(new Product("Healthy noodles", "HealthyShop", 15));
        healthyShop.addProduct(new Product("Healthy pierogi","HealthyShop", 25));
        healthyShop.addProduct(new Product("Healthy potatoes", "HealthyShop", 10));


        Supplier glutenFreeShop = new Supplier("GlutenFreeShop");
        glutenFreeShop.addProduct(new Product("GF bread", "GlutenFreeShop", 15));
        glutenFreeShop.addProduct(new Product("GF baguette","GlutenFreeShop",  25));
        glutenFreeShop.addProduct(new Product("GF chocolate cake", "GlutenFreeShop", 10));
        glutenFreeShop.addProduct(new Product("GF nachos", "GlutenFreeShop",  35));

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService orderService = new OrderService(
                new MailService(), new SupplierOrderRepository(), new SupplierRepository()
        );
        orderService.process(orderRequest);
    }
}
