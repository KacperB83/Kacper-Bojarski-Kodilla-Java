package com.kodilla.good.patterns.challenges.Food2Door;

import java.util.Map;

public interface ProducerMultiplier {

    Map<Product, Integer> process(OrderRequest orderRequest);

    int getValue();
}
