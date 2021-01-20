package com.kodilla.testing.collection;
import java.util.*;

import java.util.ArrayList;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> noOddnumbersList = new ArrayList<>();

        for (int passedNumber: numbers) {
            if (passedNumber % 2 == 0) {
                noOddnumbersList.add(passedNumber);
            }
        }
        return noOddnumbersList;
    }
}

