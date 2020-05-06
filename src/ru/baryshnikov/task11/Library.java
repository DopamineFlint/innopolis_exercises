package ru.baryshnikov.task11;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

public class Library {
    private Scanner scan = new Scanner(System.in);
    private File bookDir = new File("C:\\library");
    private ArrayList<String> arr = new ArrayList<>();
    private int choose;
    private String yn;

    public Library() {
        if (bookDir.isDirectory()) {
            System.out.println("Directory is already created");
        } else {
            bookDir.mkdir();
            System.out.println("Dir is created");
        }
    }

    public void addBook() {
        String name = scan.nextLine();
        String author = scan.nextLine();
        int year = scan.nextInt();
        String text = scan.nextLine();
        File f = new File("C:\\library\\" + name + ".dat");
        int ch = 1;

        if (f.exists()) {
            System.out.println("This file is already exist. Do you want to replace this file?");
            do {
                yn = scan.nextLine();
                switch (yn) {
                    case ("y"):
                        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\library\\"
                                + name + ".dat"))) {
                            Book b = new Book(name, author, year, text);
                            oos.writeObject(b);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        System.out.println("The file has been written");
                        ch = 0;
                        break;
                    case ("n"):
                        ch = 0;
                        break;
                    default:
                        System.out.println("Try again");
                        break;
                }
            } while (ch == 1);
        } else {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\library\\" + name +
                    ".dat"))) {
                Book b = new Book(name, author, year, text);
                oos.writeObject(b);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("The file has been written");
        }
    }

    public void readBook() {
        arr.clear();
        int i = 0;
        if (bookDir.listFiles().length == 0) {
            System.out.println("Library is empty");
            System.out.println(bookDir.listFiles().length);
        } else {
            System.out.println("Library is not empty");
            for (File item : bookDir.listFiles()) {
                System.out.println(i + ". " + item.getName());
                arr.add(item.getName());
                i++;
            }

            boolean exc = false;
            int indexNum = arr.size();
            indexNum -= 1;
            System.out.println("Enter which book you want to read");
            do {
                try {
                    choose = scan.nextInt();
                    //System.out.println(arr);
                    if ((choose < 0) || (choose > indexNum)) {
                        System.out.println("Out of bounds");
                    } else {
                        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\library\\" +
                                arr.get(choose)))) {
                            Book b = (Book) ois.readObject();
                            System.out.printf("Name: %s \t Author: %s \t Year: %d \n", b.getName(), b.getAuthor(),
                                    b.getYear());
                            exc = true;
                        } catch (Exception ex) {
                            System.out.println();
                            exc = true;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("You've entered wrong symbol");
                    scan.nextLine();
                }
            } while (!exc);
        }
    }

    public void removeBook() {
        arr.clear();
        int i = 0;
        if (bookDir.listFiles().length == 0) {
            System.out.println("Library is empty");
            System.out.println(bookDir.listFiles().length);
        } else {
            System.out.println("Library is not empty");
            for (File item : bookDir.listFiles()) {
                System.out.println(i + ". " + item.getName());
                arr.add(item.getName());
                i++;
            }

            boolean exc = false;
            int indexNum = arr.size();
            indexNum -= 1;
            System.out.println("What file you want to delete?: ");
            do {
                try {
                    choose = scan.nextInt();
                    if ((choose < 0) || (choose > indexNum)) {
                        System.out.println("Out of bounds");
                        //choose = scan.nextInt();
                    } else {
                        File f = new File("C:\\library\\" + arr.get(choose));
                        f.delete();
                        exc = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("You've entered wrong symbol");
                    scan.nextLine();
                }
            } while (!exc);
        }
    }
}