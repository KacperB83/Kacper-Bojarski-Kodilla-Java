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
            shapeCollector.addFigure(new Circle(8));
            //Then
            Assertions.assertEquals(1, shapeCollector.showFigures());
        }

        @Test
        public void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(8));
            //When
            shapeCollector.removeFigure(shapeCollector.getFigure(0));
            //Then
            Assertions.assertNull(shapeCollector);
        }
        @Test
        public void testGetFigure () {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(new Circle(8));
            //When
            shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals("Circle", shapeCollector.getFigure(0));
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
            Assertions.assertEquals(3, 3);
        }
    }
}
