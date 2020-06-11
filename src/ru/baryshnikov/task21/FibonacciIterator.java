package ru.baryshnikov.task21;

import java.util.*;

public class FibonacciIterator {

    FibonacciIterator() {

    }

    public ArrayList<Integer> numIter(ArrayList<Integer> arr) {
        int step = 0;
        int num = 0;
        int finalNum = 0;

        while (step < 10) {
            num = arr.get(step);
            if (num == 0) {
                finalNum = num + 1;
                arr.add(finalNum);
            } else {
                finalNum = arr.get(step - 1) + num;
                arr.add(finalNum);
            }
            step++;
        }

        return arr;
    }

}
