package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ThinBottomOrderDecorator extends AbstractPizzaOrderDecorator{
    public ThinBottomOrderDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String ingredientsDescription() {
        return super.ingredientsDescription() + " thin bottom, with";
    }
}
