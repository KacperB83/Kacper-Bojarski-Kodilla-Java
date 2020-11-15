package com.kodilla.testing.user;

public class Calculator {
    private int a;
    private int b;

    public int add (int a, int b) {
        System.out.println(a+b);
        return a + b;
    }
    public int subtract (int a, int b) {
        System.out.println(a-b);
        return a - b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
}
