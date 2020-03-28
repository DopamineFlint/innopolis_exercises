package ru.baryshnikov.task2;

public class MultiTable {
    public static void main(String[] args) {

        int first = 1;

        while (first <= 10) {
            for (int x = 1; x <= 10; x++) {
                int result = first * x;
                System.out.println(first + " * " + x + " = " + result);
            }
            System.out.println("\t");
            first++;
        }
    }
}
