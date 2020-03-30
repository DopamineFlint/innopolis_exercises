package ru.baryshnikov.task2;

import java.util.Scanner;

public class GeomProg { //Геом прогрессия
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of N ");
        int scanN = scan.nextInt();
        int sum = 1;
        for (int i = 1; i <= scanN; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = scan.nextInt();
            sum = sum * num;
        }
        System.out.println("Sum is: " + sum);
    }
}
