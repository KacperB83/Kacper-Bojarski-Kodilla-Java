package com.kodilla.testing.shape;

public class Square implements Shape {
    private double side;
    private double field = Math.pow(side, 2);

    public Square(double side) {
        this.side = side;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return field;
    }

    @Override
    public String toString() {
        return "This " + getShapeName() +
                ", has side = " + side +
                " cm, and field = " + getField() + " cm2";
    }
}
