package com.kodilla.good.patterns.challenges.orderService;


public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public Order process(final OrderRequest orderRequest) {
        boolean canBeOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct());
        if (canBeOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new Order(orderRequest.getUser(), true);
        } else {
            return new Order(orderRequest.getUser(), false);
        }
    }
}
