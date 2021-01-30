package com.kodilla.spring.intro.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawerTestSuite {
    @Test
    void testDoDrawingOfCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        assertEquals("This is a Circle", result);
    }

    @Test
    void testDoDrawingOfTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        assertEquals("This is a triangle", result);
    }
}
