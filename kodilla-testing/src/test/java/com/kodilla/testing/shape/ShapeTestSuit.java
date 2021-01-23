package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: Shape Test Suit")
class ShapeTestSuit {
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
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    class shapesTests{

        @DisplayName("Checks if all figures where created and added to ArrayList")
        @Test
        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square 1", 23.77);
            Shape triangle = new Triangle("Triangle 1", 35.00);
            Shape circle = new Circle("Circle 1", 13.50);

            //When
            ShapeCollector.addFigure(square);
            ShapeCollector.addFigure(triangle);
            ShapeCollector.addFigure(circle);

            //Then
            assertEquals(3, ShapeCollector.ShowFigures());
        }

        @DisplayName("Checks if figures where removed")
        @Test
        void testRemoveShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape triangle = new Triangle("Triangle 2", 45.00);
            ShapeCollector.addFigure(triangle);

            //When
            boolean ifRemoved = shapeCollector.removeFigure(triangle);

            //Then
            assertEquals(ifRemoved, true);
        }

        @DisplayName("Shows one of the objects from the ArrayList")
        @Test
        void testGetShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square 2", 13.77);
            ShapeCollector.addFigure(square);


            //When
            Shape myShape = shapeCollector.getFigure(0);
            shapeCollector.removeFigure(square);

            //Then
            assertEquals(myShape, square);
        }

        @DisplayName("Shows all figures")
        @Test
        void testShowShapes() {
            //Given

            //When

            //Then

        }
    }
}