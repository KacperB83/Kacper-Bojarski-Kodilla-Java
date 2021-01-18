package com.kodilla.good.patterns.challenges.orderService;


public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;
    private ProductRepository productRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository, final ProductRepository productRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.productRepository = productRepository;
    }

    public Order process(final OrderRequest orderRequest) {
        boolean productAvailable = productRepository.checkAvailability(orderRequest.getProduct());
        boolean canBeOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if (canBeOrdered && productAvailable) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new Order(orderRequest.getUser(), true);

        } else {
            return new Order(orderRequest.getUser(), false);
        }
    }
}
