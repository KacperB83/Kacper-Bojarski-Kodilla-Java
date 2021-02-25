package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderService {

    private ExtraFoodShop extraFoodShop;
    private GlutenFreeShop glutenFreeShop;
    private HealthyShop healthyShop;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderService(final ExtraFoodShop extraFoodShop, final GlutenFreeShop glutenFreeShop,
                        final HealthyShop healthyShop, final InformationService informationService,
                        final OrderRepository orderRepository) {
        this.extraFoodShop = extraFoodShop;
        this.glutenFreeShop = glutenFreeShop;
        this.healthyShop = healthyShop;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public Order process(final OrderRequest orderRequest) {

        boolean checkExtraFoodShop = extraFoodShop.checkAvailability(orderRequest);
        boolean checkGlutenFreeShop = glutenFreeShop.checkAvailability(orderRequest);
        boolean checkHealthyShop = healthyShop.checkAvailability(orderRequest);

        if (checkExtraFoodShop) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), extraFoodShop.getSupplierName(), extraFoodShop.getOrderedProducts(), extraFoodShop.getTotalPrice());
            new Order(orderRequest.getUser(), extraFoodShop.getSupplierName(), extraFoodShop.getOrderedProducts(), extraFoodShop.getTotalPrice());
        }
        if (checkGlutenFreeShop) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), glutenFreeShop.getSupplierName(), glutenFreeShop.getOrderedProducts(), glutenFreeShop.getTotalPrice());
            new Order(orderRequest.getUser(), glutenFreeShop.getSupplierName(), glutenFreeShop.getOrderedProducts(), glutenFreeShop.getTotalPrice());
        }
        if (checkHealthyShop) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), healthyShop.getSupplierName(), healthyShop.getOrderedProducts(), healthyShop.getTotalPrice());
            new Order(orderRequest.getUser(), healthyShop.getSupplierName(), healthyShop.getOrderedProducts(), healthyShop.getTotalPrice());

        } else {
            System.out.println("We can't realize Your order.");
        }
        return null;
    }
}
