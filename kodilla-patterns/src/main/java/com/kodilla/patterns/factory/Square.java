package com.kodilla.patterns.factory;

public final class Square implements Shape{
    private final String name;
    private final double windth;

    public Square(String name, double windth) {
        this.name = name;
        this.windth = windth;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return Math.pow(windth, 2.0);
    }

    @Override
    public double getCircumference() {
        return 4 * windth;
    }
}
