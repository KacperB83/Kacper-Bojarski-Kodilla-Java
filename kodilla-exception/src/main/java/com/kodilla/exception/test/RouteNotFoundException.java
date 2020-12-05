package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    public RouteNotFoundException() {
        System.out.println("Sorry. We do not have flights to this destination.");
    }
}
