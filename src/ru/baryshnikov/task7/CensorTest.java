package ru.baryshnikov.task7;

import java.util.Scanner;

public class CensorTest {
    public static void main(String[] args) {
        Censor censor = new Censor();
        Scanner scan = new Scanner(System.in);
        censor.useCensor(scan.nextLine());
    }
}
