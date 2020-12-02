package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        double avg = 0.0;
        IntStream.range(0, numbers.length)
                .forEach(i -> System.out.println(numbers));
        IntStream.range(0, numbers.length)
                .average().getAsDouble();
        return avg;
    }
}
