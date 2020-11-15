package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OddNumbersExterminator {
    private Random random = new Random();

    public List<Integer> exterminate() {
        List<Integer> numbers = new ArrayList<>();
        for (int n = 0; n < 20; n++) {
            int ran = random.nextInt(20);
            if (ran % 2 == 0 && ran != 0) {
                numbers.add(ran);
            }
        }
        return numbers;
    }
}
