package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThickBottomOrderDecorator extends AbstractPizzaOrderDecorator{
    public ThickBottomOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(12));
    }

    @Override
    public String ingredientsDescription() {
        return super.ingredientsDescription() + " thick bottom, with";
    }
}
