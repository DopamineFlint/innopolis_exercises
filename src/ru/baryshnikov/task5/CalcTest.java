package ru.baryshnikov.task5;

import static ru.baryshnikov.task5.Calculator.*;

public class CalcTest {
    public static void main(String[] args) {
        summarize(10.7, 20.3);
        summarize(10, 34.6);
        summarize(33.3, 10);
        summarize(10, 10);

        subtraction(2.3, 1.3);
        subtraction(25, 34);
        subtraction(33, 44.4);
        subtraction(23.4, 32);

        multiply(12, 4);
        multiply(3.3, 4.2);
        multiply(23, 3.2);
        multiply(3.2, 3);

        division(12.9, 3.3);
        division(12, 3);
        division(12, 6.0);
        division(6.9, 2.3);

        percentage(334.1);
        percentage(322);
    }
}
