package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("sesame")
                .burgers(2)
                .ingredient("mushrooms")
                .sauce("standard sauce")
                .ingredient("beacon")
                .ingredient("salad")
                .build();
        System.out.println(bigmac);
        //When
        int howManyBurgers = bigmac.getBurgers();
        //Then
        assertEquals(2, howManyBurgers);
        assertEquals(3, bigmac.getIngredients().size());

}
}
