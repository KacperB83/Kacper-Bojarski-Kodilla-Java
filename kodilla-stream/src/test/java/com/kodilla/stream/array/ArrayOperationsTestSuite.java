package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2, 4, 7, 9, 10, 20, 4, 50, 8, 13, 45, 23, 2, 67, 34, 3, 1, 3, 88, 9};

        //When
        double average = ArrayOperations.getAverage(numbers);
        System.out.println(average);

        //Then
        assertEquals(20, numbers.length);
        assertEquals(20.1, average, 0.001);
    }
}
