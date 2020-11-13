package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.user.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");
        Calculator calculator = new Calculator(5, 10);
        System.out.println(calculator.add());
        System.out.println(calculator.subtract());
        System.out.println();
        if(calculator.getA() != 0 && calculator.getB() != 0) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}
