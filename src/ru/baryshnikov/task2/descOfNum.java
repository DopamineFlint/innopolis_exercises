package ru.baryshnikov.task2;

import java.util.Scanner;

public class descOfNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = scan.nextInt();
        System.out.println("\n");

        if ((num < 0) && (num % 2 == 0)) {
            System.out.print("Number is even and negative \n");
        } else if ((num > 0) && (num % 2 == 0)) {
            System.out.print("Number is even and positive \n");
        } else if ((num < 0) && !(num % 2 == 0)) {
            System.out.print("Number is negative and odd \n");
        } else if ((num > 0) && !(num % 2 == 0)) {
            System.out.println("Number is positive and odd");
        } else {
            System.out.println("Number is zero");
        }
    }
}
