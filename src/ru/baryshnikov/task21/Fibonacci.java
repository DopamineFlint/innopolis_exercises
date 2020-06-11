package ru.baryshnikov.task21;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(0);
        FibonacciIterator fi = new FibonacciIterator();
        System.out.println(fi.numIter(al));

        ArrayList<Integer> all = new ArrayList<>();
        all.add(0);
        FibRecur fr = new FibRecur();
        System.out.println(fr.numRecur(all));
    }
}
