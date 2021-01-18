package com.kodilla.good.patterns.challenges.orderService;

public class Application {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new MailService(), new PhoneOrderService(), new PhoneOrderRepositiry());
        productOrderService.process(orderRequest);
    }
}
