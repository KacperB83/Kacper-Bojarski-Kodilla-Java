package com.kodilla.good.patterns.challenges.orderService;

import java.util.Map;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public ProductOrderService(final ProductRepository productRepository,
                               final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public Order process(final OrderRequest orderRequest) {

            boolean productAvailable = productRepository.checkAvailability(orderRequest);
            if (productAvailable) {
                informationService.inform(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getUser(), productRepository.getOrderedProducts());

                return new Order(orderRequest.getUser(), productRepository.getOrderedProducts());
            } else {
                System.out.println("We can't realize Your order.");
                return null;
            }
        }

}
