package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.List;

@DisplayName("List test ")
class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("Test case: end");
    }
    @DisplayName("when create List with oddNumbers, " +
            "then check if it's empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(null);
        numbers.add(0);
        //When
        System.out.println("Checking if can put null values");

        //Then
        //Assertions.assertFalse();

    }
    void testOddNumbersExterminatorNormalList () {

    }
}
