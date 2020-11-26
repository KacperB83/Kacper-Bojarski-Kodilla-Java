package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.*;

import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test # " + testCounter);
    }

    @Nested
    @DisplayName("Tests for ShapeCollector")
    class TestShapeMethods {
        @Test
        public void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Circle(5));
            //Then
            Assertions.assertEquals(1, shapeCollector.showFigures().size());
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(8));
            //When
            shapeCollector.removeFigure(shapeCollector.getFigure(0));
            //Then
            Assertions.assertEquals(0, shapeCollector.showFigures().size());
        }

        @Test
        public void testGetFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(5));
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shapeCollector.getFigure(0), retrievedFigure);
        }

        @Test
        public void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(8));
            shapeCollector.addFigure(new Triangle(8, 6));
            shapeCollector.addFigure(new Square(8));
            //When
            shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(3, shapeCollector.showFigures().size());
        }

        @Test
        public void testGetSquareField () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Square(5));
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(25, retrievedFigure.getField());
        }

        @Test
        public void testGetTriangleField () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Triangle(5, 4));
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(10, retrievedFigure.getField());
        }
        @Test
        public void testGetCircleField () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(5));
            //When
            Shape retrievedFigure;
            retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(78.53981633974483, retrievedFigure.getField());
        }
    }
}
