package ru.baryshnikov.task1;

import java.util.Scanner;

public class SecConverter {
    public static void main(String[] args) {
        Scanner secScan = new Scanner(System.in);
        int secs = secScan.nextInt();
        int minutes = secs/60;
        int hrs = minutes/60;
        System.out.println("hours: " + hrs);
    }
}
