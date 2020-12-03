package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent continent = new Continent();

        //When
        World world = new World(continent);

        //Then
        String numberOfPeopleInTheWorld = world.getPeopleQuantity(continent).toString();

        assertEquals("3393927000", numberOfPeopleInTheWorld);

    }
}

