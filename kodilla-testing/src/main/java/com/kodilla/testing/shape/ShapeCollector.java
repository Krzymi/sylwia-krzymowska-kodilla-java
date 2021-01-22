package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private static List<Shape> myList = new ArrayList<>();

    public List<Shape> getMyList() {
        return myList;
    }

    public static void addFigure(Shape shape) {
        myList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        return myList.remove(shape);
    }

    public void getFigure(int n) {
        //return myList.get(n);
    }

    public void ShowFigures() {
         myList.size();
    }
}
