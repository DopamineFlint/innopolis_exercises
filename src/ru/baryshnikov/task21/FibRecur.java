package ru.baryshnikov.task21;

import java.util.*;

public class FibRecur {

    public ArrayList<Integer> numRecur(ArrayList<Integer> arr) {
        int num;
        int step = arr.size() - 1;
        int finalNum;
        FibRecur fr = new FibRecur();

        num = arr.get(step);
        if (num == 0) {
            finalNum = num + 1;
        } else {
            finalNum = arr.get(step - 1) + num;
        }
        arr.add(finalNum);

        if (step < 9) {
            return fr.numRecur(arr);
        } else {
            return arr;
        }
    }
}
