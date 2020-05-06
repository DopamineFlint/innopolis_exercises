package ru.baryshnikov.task11;

import java.util.Scanner;

public class LibraryTest {
    public static void main(String[] args) {
        int e = 1;
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        do {
            String s = scan.nextLine();
            switch (s) {
                case("1"):
                    System.out.println("Add Book");
                    lib.addBook();
                    break;
                case("2"):
                    System.out.println("Read Book");
                    lib.readBook();
                    break;
                case("3"):
                    System.out.println("Delete File");
                    lib.removeBook();
                    break;
                case("4"):
                    System.out.println("Exit");
                    e = 0;
                    break;
                default:
                    System.out.println("You've entered wrong symbol");
            }
        } while (e == 1);
    }
}
