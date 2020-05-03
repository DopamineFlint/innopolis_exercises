package ru.baryshnikov.task10;

import java.util.Scanner;

public class FileTest {
    public static void main(String[] args) {
        int counter = 1;

        do {
            System.out.println("1. Create File");
            System.out.println("2. Delete File");
            System.out.println("3. Rename File");
            System.out.println("4. Copy File");
            System.out.println("5. Exit");
            Scanner scan = new Scanner(System.in);
            String in = scan.next();

            switch (in) {
                case ("1"):
                    System.out.println("Create File");
                            FileMethods.createFile();
                    break;
                case ("2"):
                    System.out.println("Delete File");
                            FileMethods.deleteFile();
                    break;
                case ("3"):
                    System.out.println("Rename File");
                            FileMethods.renameFile();
                    break;
                case ("4"):
                    System.out.println("Copy File");
                    FileMethods.copyFile();
                    break;
                case ("5"):
                    System.out.println("Exit");
                    counter = 0;
                    break;
            }
        } while (counter != 0);
    }
}