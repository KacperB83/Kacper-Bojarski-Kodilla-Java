package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private ExtraFoodShop extraFoodShop;
    private GlutenFreeShop glutenFreeShop;
    private HealthyShop healthyShop;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderService(final ExtraFoodShop extraFoodShop, final GlutenFreeShop glutenFreeShop,
                        final HealthyShop healthyShop,
                        final InformationService informationService,
                        final OrderRepository orderRepository) {
        this.extraFoodShop = extraFoodShop;
        this.glutenFreeShop = glutenFreeShop;
        this.healthyShop = healthyShop;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public Order process(final OrderRequest orderRequest) {

        Map<Product, Integer> productsAvailable = new HashMap<>();
        List<Integer> totalValue = new ArrayList<>();

        productsAvailable.putAll(extraFoodShop.process(orderRequest));
        totalValue.add(extraFoodShop.getValue());
        productsAvailable.putAll(glutenFreeShop.process(orderRequest));
        totalValue.add(glutenFreeShop.getValue());
        productsAvailable.putAll(healthyShop.process(orderRequest));
        totalValue.add(healthyShop.getValue());

        int sum = sumValue(totalValue);

        if (productsAvailable.size() > 0) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), productsAvailable, sum);

            return new Order(orderRequest.getUser(), productsAvailable, sum);

        } else {
            System.out.println("We can't realize Your order.");
            return null;
        }
    }

    private int sumValue(List<Integer> totalValue) {
        int sum = 0;
        for (int s : totalValue) {
            sum += s;
        }
        return sum;
    }
}
