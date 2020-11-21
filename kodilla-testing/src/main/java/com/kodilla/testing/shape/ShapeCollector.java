package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShapeCollector {
    private Shape shape;

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure (Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure (Shape shape) {
        System.out.println(shape.getShapeName()+" has been removed.");
        shapes.remove(shape);
    }

    public Shape getFigure (int n) {
        System.out.println(shapes.get(n));
        return shapes.get(n);
    }

    public List<Shape> showFigures() {
        System.out.println(shapes);
        return shapes;
    }
}
