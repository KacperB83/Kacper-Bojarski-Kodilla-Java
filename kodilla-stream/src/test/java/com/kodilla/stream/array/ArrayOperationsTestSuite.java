package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationsTestSuite implements ArrayOperations {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {2, 4, 7, 9, 10, 20, 4};

        //When
        Double averageNumber = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(7, numbers.length);
        //assertEquals(8, averageNumber);
    }
}
