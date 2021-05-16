package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testThinPizzaWithIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThinBottomOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        System.out.println("Total pizza cost: " + pizzaOrder.getCost());
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        String ingredients = pizzaOrder.ingredientsDescription();
        //Then
        assertEquals(new BigDecimal(21), pizzaCost);
        assertEquals("Custom my pizza on thin bottom, with extra cheese, mushrooms, ham,", ingredients);
    }
    @Test
    public void testThickPizzaWithIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new ThickBottomOrderDecorator(pizzaOrder);
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        System.out.println("Total pizza cost: " + pizzaOrder.getCost());
        //When
        BigDecimal pizzaCost = pizzaOrder.getCost();
        String ingredients = pizzaOrder.ingredientsDescription();
        //Then
        assertEquals(new BigDecimal(21), pizzaCost);
        assertEquals("Custom my pizza on thick bottom, with extra cheese, ham,", ingredients);

    }
}
