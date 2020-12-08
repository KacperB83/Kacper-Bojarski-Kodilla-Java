package com.kodilla.exception.test;

public class SecondChallenge {

    public String probablyIWillThrowException(double x, double y) throws Exception {
        try {

           if (x >= 2 || x < 1 || y == 1.5)
               System.out.println("Everything is ok with");


        } catch(Exception e) {
            throw new ExceptionHandling("Something is wrong with logical conditions.");
        } finally {
            System.out.println("Try to avoid conditions conflict.");
        }

        return "Done";
    }

    public static void main(String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        String result = secondChallenge.probablyIWillThrowException(1, 3);
        System.out.println(result);
    }
}
