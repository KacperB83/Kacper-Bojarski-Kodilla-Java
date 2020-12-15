package com.kodilla.exception.test;

public class ExceptionHandling extends Exception {

    public ExceptionHandling(final int x, final int y) {}

    public static void main(String[] args) {

        SecondChallenge challenge = new SecondChallenge();
        try {
            challenge.probablyIWillThrowException(3, 1.5);
        } catch (Exception e) {
            System.out.println("Check out logical conditions.");
        } finally {
            System.out.println("Try to avoid conditions conflict.");
        }
    }
}
