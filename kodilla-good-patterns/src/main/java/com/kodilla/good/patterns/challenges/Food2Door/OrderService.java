package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private SupplierRepository supplierRepository;
    private Supplier supplier;

    public OrderService(final InformationService informationService, final OrderRepository orderRepository, final SupplierRepository supplierRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.supplierRepository = supplierRepository;
    }

    public Order process(final OrderRequest orderRequest) {
        boolean checkRepository = supplierRepository.checkAvailability();
        if(checkRepository) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getListOfProducts());
            return new Order(orderRequest.getUser(), supplier.getNameOfSupplier(), orderRequest.getListOfProducts(),true);

        } else {
            return new Order(orderRequest.getUser(), supplier.getNameOfSupplier(), orderRequest.getListOfProducts(), false);
        }
    }
}
