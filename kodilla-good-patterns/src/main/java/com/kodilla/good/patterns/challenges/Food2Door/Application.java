package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderService orderService = new OrderService(
                new MailService(), new SupplierOrderRepository(), new SupplierRepository()
        );
        orderService.process(orderRequest);
    }
}
