package com.kodilla.good.patterns.challenges.orderService;

import java.util.List;
import java.util.Map;

public class ProductOrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public ProductOrderService(final ProductRepository productRepository,
                               final InformationService informationService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public Order process(final OrderRequest orderRequest) {

        Map<Product, Integer> productsAvailable = productRepository.checkAvailability(orderRequest);
        if (productsAvailable.size() != 0) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), productsAvailable, productRepository.getTotalPrice());

            return new Order(orderRequest.getUser(), productsAvailable, productRepository.getTotalPrice());
        } else {
            System.out.println("Sorry. We can't realize Your order.");
            return null;
        }
    }
}
