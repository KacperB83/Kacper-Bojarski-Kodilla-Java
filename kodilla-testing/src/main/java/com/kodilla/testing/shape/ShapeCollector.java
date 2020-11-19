package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;

    private List<Shape> shapes = new ArrayList<>();

    public void addFigure (Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> removeFigure (Shape shape) {
        shapes.remove(shape);
        return shapes;
    }

    public Shape getFigure (int n) {
        return shapes.get(n);
    }

    public List<Shape> showFigures() {
        return shapes;
    }
}
