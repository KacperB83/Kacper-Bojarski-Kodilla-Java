package com.kodilla.testing;

import com.kodilla.testing.collection.OddNumbersExterminator;
import com.kodilla.testing.user.Calculator;

import java.util.List;

public class TestingMain {
    public static void main(String[] args) {

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> oddNumbers = oddNumbersExterminator.exterminate();

        System.out.println(oddNumbers);

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
