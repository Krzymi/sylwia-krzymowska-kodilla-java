package com.kodilla.testing.calculator;

public class MyCalculator {
    private int a;
    private int b;

    public MyCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        int c = a + b;
        return c;
    }
    public int substract() {
        int c = a - b;
        return c;
    }
}
