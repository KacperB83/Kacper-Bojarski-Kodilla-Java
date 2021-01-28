package com.kodilla.good.patterns.challenges.orderService;

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

            boolean productAvailable = productRepository.checkAvailability(orderRequest);
            if (!productAvailable) {
                informationService.inform(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getUser(), productRepository.getOrderedProducts(), productRepository.getTotalPrice());

                return new Order(orderRequest.getUser(), productRepository.getOrderedProducts(), productRepository.getTotalPrice());
            } else {
                System.out.println("We can't realize Your order.");
                return null;
                //return new Order(orderRequest.getUser(), productRepository.getOrderedProducts(), productRepository.getTotalPrice());
            }
        }

}
