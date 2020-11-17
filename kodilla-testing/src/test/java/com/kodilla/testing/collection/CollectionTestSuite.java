package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.List;

@DisplayName("List test ")
class CollectionTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @DisplayName("when create List with null , " +
            "then check if it's empty"
    )
    @Test
    void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        //When
        numbers.add(null);
        System.out.println("Checking if can put null values");
        //Then
        Assertions.assertEquals(null, numbers.get(0));

    }
    @DisplayName("when create List with odd value , " +
            "then check if it was put in List "
    )
    @Test
    void testOddNumbersExterminatorNormalList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        //When
        numbers.add(6);

        System.out.println("Checking if can put odd value");
        //Then
        Assertions.assertEquals(6, numbers.get(0));
    }
}
