package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{
    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5);
    }

    @Override
    public String ingredientsDescription() {
        return "Custom my pizza on";
    }
}
