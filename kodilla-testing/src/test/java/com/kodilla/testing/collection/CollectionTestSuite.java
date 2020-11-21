package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@DisplayName("Class test ")
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

    @DisplayName("when create empty new object , " +
            "then check if class works fine"
    )
    @Test
    void testOddNumbersExterminatorEmptyList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers1 = new ArrayList<>();

        //When
        List<Integer> newList = oddNumbersExterminator.exterminate(numbers1);
        System.out.println("Checking if can put empty List");
        //Then
        Assertions.assertEquals(0, newList.size());
    }

    @DisplayName("when create new object with odd and even values , " +
            "then check if it was put in List "
    )
    @Test
    void testOddNumbersExterminatorNormalList () {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
       // List<Integer> numbers1 = new ArrayList<>();
        //When
        Integer nr[] = new Integer[] {6, 1, 4, 3, 10};
        List<Integer> numbers1 = Arrays.asList(nr);
        /*numbers1.add(6);
        numbers1.add(1);
        numbers1.add(4);
        numbers1.add(3);
        numbers1.add(10);*/
        List<Integer> newList = oddNumbersExterminator.exterminate(numbers1);
        System.out.println("Checking if can put odd value");
        //Then
        Assertions.assertEquals(6, newList.get(0));
        Assertions.assertEquals(4, newList.get(1));
        Assertions.assertEquals(10, newList.get(2));
    }
}
