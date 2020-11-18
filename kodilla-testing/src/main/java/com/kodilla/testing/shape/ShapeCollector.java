package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure (Shape shape) {
        this.shape = shape;
        for (Shape figure: shapes) {
            shapes.add(figure);
        }
    }

    public List<Shape> removeFigure (Shape shape) {
        shapes.remove(shape);
        return shapes;
    }

    public String getFigure (int n) {
        return " This is " + shapes.get(n) + " and it's field is "+ shape.getField() + " square centimeters.";
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
