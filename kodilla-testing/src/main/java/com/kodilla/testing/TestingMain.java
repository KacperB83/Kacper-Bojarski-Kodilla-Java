package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.Calculator;

import java.util.ArrayList;
import java.util.List;

public class TestingMain {
    public static void main(String[] args) {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(24);
        numbers.add(35);
        numbers.add(22);
        numbers.add(4);
        numbers.add(6);
        numbers.add(10);
        numbers.add(3);

        System.out.println(numbers);
        System.out.println(oddNumbersExterminator.exterminate(numbers));

        /*System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator();

        int addResult = calculator.add(2,4);
        int subResult = calculator.subtract(6,-7);

        System.out.println();

        if((addResult == 6) && (subResult == 13)) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }*/
    }
}
