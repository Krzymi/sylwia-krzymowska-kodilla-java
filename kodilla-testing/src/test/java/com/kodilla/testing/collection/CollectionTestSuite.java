package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;
import java.util.*;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When given List is empty an 'OddNumbersExterminator' class should not throw an error and continue")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> myEptyList = new ArrayList<>();
        //When
        List<Integer> myResult = oddNumbersExterminator.exterminate(myEptyList);
        System.out.println("Testing an empty list: " + myResult);
        //Then
        Assertions.assertEquals(myEptyList, myResult);
    }

    @DisplayName("The method 'exterminate()' should extract all odd numbers from a given List")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> myList = new ArrayList<>();
        myList.add(4);
        myList.add(5);
        myList.add(7);
        myList.add(12);
        //When
        List<Integer> myResult = oddNumbersExterminator.exterminate(myList);
        System.out.println("Testing a list of: " + myList + ". List after exterminate consistes of: " + myResult);
        //Then
        Assertions.assertNotEquals(myList, myResult);
    }
}

