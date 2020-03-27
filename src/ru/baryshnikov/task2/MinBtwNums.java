package ru.baryshnikov.task2;

import java.util.Scanner;

public class MinBtwNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input first number: \n");
        int num1 = scan.nextInt();
        System.out.print("Input second number: \n");
        int num2 = scan.nextInt();

        if (num1 < num2) {
            System.out.println("First number is less than second: " + num1);
        }else{
            System.out.println("Second number is less than first: " + num2);
        }
    }
}
