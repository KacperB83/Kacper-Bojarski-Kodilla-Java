package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double base;
    private double height;
    private double field;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return field  = (base*height)/2;
    }
    @Override
    public String toString() {
        return "This " + getShapeName() +
                ", has base = " + base +
                " cm, height = " + height + " cm, and field = " + getField() + " cm2";
    }

    /*
    private int sideA;
    private int sideB;
    private int sideC;
    private int p;
    private double field;

    public Triangle(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        p = (sideA + sideB + sideC) / 2; //half of perimeter of triangle
        field = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
        if ((sideA + sideB < sideC) || (sideA + sideC < sideB) || (sideC + sideB < sideA)) {
            return field;
        } else {
            System.out.println("In triangle length sum of 2 shorter sides has to be smaller then length of 3rd.");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "This " + getShapeName() +
                ", has field = " + getField() + " cm2";
    }*/
}

