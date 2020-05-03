package ru.baryshnikov.task10;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileMethods {
    private static File file1;
    private static File file2;
    private static File dir;
    private static Scanner scan = new Scanner(System.in);

    public static void createFile() {
        System.out.println("Where you want to create file? ");
        String where = scan.nextLine();
        System.out.println("Name of file: ");
        String name = scan.nextLine();
        file2 = new File(where);
        boolean created = file2.mkdir();
        if (created) {
            System.out.println("Folder is created");
        } else {
            System.out.println("Folder is already exists");
        }

        file1 = new File(where + "\\" + name);

        try {
            if (!file1.exists()) {
                file1.createNewFile();
            } else {
                System.out.println("File is already created");
            }
        } catch (IOException e) {
            System.out.println("createFile exception");
        }
        System.out.println(file1);
        file1 = null;
    }

    public static void deleteFile() {
        System.out.println("Full location of file you want to delete: ");
        String loc = scan.nextLine();
        file1 = new File(loc);
        if (file1.exists()) {
            file1.delete();
            System.out.println("File is deleted!");
        } else {
            System.out.println("File doesn't exist");
        }
        file1 = null;
    }

    public static void renameFile() {
        System.out.println("Full path of file: ");
        String loc = scan.nextLine();
        System.out.println("Rename to: ");
        String rename = scan.nextLine();
        file1 = new File(loc);
        file2 = new File(rename);
        file1.renameTo(file2);

        System.out.println("File renamed");

        file1 = null;
        file2 = null;
    }

    public static void copyFile() {
        System.out.println("Full location of file: ");
                String loc = scan.nextLine();
        System.out.println("Full destination of file: ");
        String dest = scan.nextLine();
        file1 = new File(loc);
        Path copied = Paths.get(dest);
        Path op = file1.toPath();

        try {
            Files.copy(op, copied, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("error");
        }
        file1 = null;
        file2 = null;
    }
}
