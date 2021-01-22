package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.List;

import static com.kodilla.testing.shape.ShapeCollector.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("TDD: Shape Test Suit")
class ShapeTestSuit {
    private static int testCounter = 0;
    private List<Shape> myList;

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
        @Test
        void testAddShape() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape square = new Square("Square 1", 23.77);

            //When
            addFigure(square);

            //Then
            assertEquals(1, myList.size());
        }
    }
}