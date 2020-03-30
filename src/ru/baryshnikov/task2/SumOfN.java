package ru.baryshnikov.task2;

import java.util.Scanner;

public class SumOfN { //Арифм прогрессия
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of N");
        int scanN = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= scanN; i++) {
            System.out.println("Enter number " + i + ": ");
            int num = scan.nextInt();
            sum += num;
        }
        System.out.println("Sum is: " + sum);
    }
}
