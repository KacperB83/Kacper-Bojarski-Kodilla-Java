package com.kodilla.testing.shape;

public class Circle implements Shape {
    private int radius;
    private double field = Math.PI*Math.pow(radius,2);

    public Circle(int radius){
        this.radius = radius;
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return field;
    }
}