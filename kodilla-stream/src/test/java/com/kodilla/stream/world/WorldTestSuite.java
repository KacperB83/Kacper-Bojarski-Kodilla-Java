package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent europe = world.addContinent(new Continent("Europe"));
        europe.addCountry(new Country("Poland", new BigDecimal(38000000)));
        europe.addCountry(new Country("France", new BigDecimal(66990000)));
        europe.addCountry(new Country("Austria", new BigDecimal(8859000)));
        europe.addCountry(new Country("Croatia", new BigDecimal(4058000)));

        Continent asia = world.addContinent(new Continent("Europe"));
        asia.addCountry(new Country("China", new BigDecimal(1393000000)));
        asia.addCountry(new Country("Russia", new BigDecimal(144500000)));
        asia.addCountry(new Country("India", new BigDecimal(1353800000)));
        asia.addCountry(new Country("Sri Lanka", new BigDecimal(21670000)));

        Continent africa = world.addContinent(new Continent("Africa"));
        africa.addCountry(new Country("RPA", new BigDecimal(57780000)));
        africa.addCountry(new Country("Egypt", new BigDecimal(98420000)));
        africa.addCountry(new Country("Nigeria", new BigDecimal(131850000)));
        africa.addCountry(new Country("Ethiopia", new BigDecimal(75000000)));

        System.out.println(world.getContinents());

        //When & Then
        String numberOfPeopleInTheWorld = world.getPeopleQuantity().toString();

        assertEquals("3393927000", numberOfPeopleInTheWorld);

    }
}

