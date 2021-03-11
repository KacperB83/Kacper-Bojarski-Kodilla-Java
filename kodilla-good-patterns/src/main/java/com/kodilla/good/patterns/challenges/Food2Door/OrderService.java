package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderService {

    private List<ProducerMultiplier> producers;
    private InformationServiceF2D informationService;
    private OrderRepository orderRepository;

    public OrderService(final List<ProducerMultiplier> producers,
                        final InformationServiceF2D informationService,
                        final OrderRepository orderRepository) {
        this.producers = producers;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public Order processOrders(final OrderRequest orderRequest) {

        Map<Product, Integer> productsAvailable = new HashMap<>();
        List<Integer> totalValue = new ArrayList<>();

        for(ProducerMultiplier producer: producers) {
            productsAvailable.putAll(producer.process(orderRequest));
            totalValue.add(producer.getValue());
        }

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
