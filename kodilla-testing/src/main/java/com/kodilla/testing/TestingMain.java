package com.kodilla.testing;

import com.kodilla.calculator.MyCalculator;

public class TestingMain {

    public static void main(String[] args) {
        int a = 18;
        int b = 12;

        MyCalculator myCalculator = new MyCalculator(a, b);

        int resultAdd;
        int resultSubstract;

        resultAdd = myCalculator.add();
        resultSubstract = myCalculator.substract();

        if (resultAdd == a + b) {
            System.out.println("Adding successful, " + a + " + " + b + " is: " + resultAdd);
        } else {
            System.out.println("Error with calculator - adding");
        }

        if (resultSubstract == a - b) {
            System.out.println("Substracting successful, " + a + " - " + b + " is: " + resultSubstract);
        } else {
            System.out.println("Error with calculator - substracting");
        }
    }
}
