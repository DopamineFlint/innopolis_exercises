package ru.baryshnikov.task5;

public class Calculator {
    private static double totalSum = 0;

    public static void summarize(double sum1, double sum2) {
        totalSum = sum1 + sum2;
        System.out.println(totalSum);
    }

    public static void summarize(int sum1, double sum2) {
        totalSum = sum1 + sum2;
        System.out.println(totalSum);
    }

    public static void summarize(double sum1, int sum2) {
        totalSum = sum1 + sum2;
        System.out.println(totalSum);
    }

    public static void summarize(int sum1, int sum2) {
        totalSum = sum1 + sum2;
        System.out.println(totalSum);
    } //здесь заканчивается summarize

    public static void subtraction(double sub1, double sub2) {
        totalSum = sub1 + sub2;
        System.out.println(totalSum);
    }

    public static void subtraction(int sub1, int sub2) {
        totalSum = sub1 + sub2;
        System.out.println(totalSum);
    }

    public static void subtraction(int sub1, double sub2) {
        totalSum = sub1 + sub2;
        System.out.println(totalSum);
    }

    public static void subtraction(double sub1, int sub2) {
        totalSum = sub1 + sub2;
        System.out.println(totalSum);
    } //здесь заканчивается substraction

    public static void multiply(int mult1, int mult2) {
        totalSum = mult1 * mult2;
        System.out.println(totalSum);
    }

    public static void multiply(double mult1, double mult2) {
        totalSum = mult1 * mult2;
        System.out.println(totalSum);
    }

    public static void multiply(int mult1, double mult2) {
        totalSum = mult1 * mult2;
        System.out.println(totalSum);
    }

    public static void multiply(double mult1, int mult2) {
        totalSum = mult1 * mult2;
        System.out.println(totalSum);
    }

    public static void division(double div1, double div2) {
        totalSum = div1 / div2;
        System.out.println(totalSum);
    }

    public static void division(int div1, int div2) {
        totalSum = div1 / div2;
        System.out.println(totalSum);
    }

    public static void division(int div1, double div2) {
        totalSum = div1 / div2;
        System.out.println(totalSum);
    }

    public static void division(double div1, int div2) {
        totalSum = div1 / div2;
        System.out.println(totalSum);
    } //division

    public static void percentage(double per1) {
        totalSum = per1 / 100;
        System.out.println(totalSum);
    }

    public static void percentage(int per1) {
        totalSum = per1 / 100;
        System.out.println(totalSum);
    }
}
