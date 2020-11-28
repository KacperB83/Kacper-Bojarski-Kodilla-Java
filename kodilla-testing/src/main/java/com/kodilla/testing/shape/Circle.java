package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private double field;

    public Circle(double radius){
        this.radius = radius;
        field = Math.PI*Math.pow(radius,2);
    }

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "This " + getShapeName() +
                ", has radius = " + radius +
                " cm, and field = " + getField()+ " cm2";
    }
}