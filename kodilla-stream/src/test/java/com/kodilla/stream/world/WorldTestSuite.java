package com.kodilla.stream.world;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.portfolio.Task;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Continent continent = new Continent();
        World people = new World();

        //When
        List<Country> countriesList = continent.getCountiesList();
        BigDecimal number = new BigDecimal(0);

        //Then
       /* BigDecimal numberOfPeopleInTheWorld = IntStream.range(0, countriesList.size()))
                .(operand -> number.add(people.getPeopleQuantity()))
                .forEach(System.out::println)
                .sum();

        assertEquals(0, numberOfPeopleInTheWorld);*/
    }
}

