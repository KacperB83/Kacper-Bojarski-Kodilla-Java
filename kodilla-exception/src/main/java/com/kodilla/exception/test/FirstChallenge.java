package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        try {
            double value = a / b;
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0 value.");
        } finally {
            System.out.println("Remember You don't divide by ZERO!");
        }
        return a / b;

    }
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
