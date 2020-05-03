package ru.baryshnikov.task10;

import java.io.File;
import java.util.Scanner;

public class AnotherClass {
    private static Scanner scan = new Scanner(System.in);
    private static File dir;
    private static String loc;

    public static void scanDir(String d) {
        loc = d;
        dir = new File(loc);
        if (dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                if (item.isDirectory()) {
                    System.out.println(item.getName() + " \t folder");
                    scanDir(item.getAbsolutePath());
                } else {
                    System.out.println(item.getName() + " \t file");
                }
            }
        }
    }
}
