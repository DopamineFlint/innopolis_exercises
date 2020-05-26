package ru.baryshnikov.task13;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> products = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Double> amount = new ArrayList<>();
        String s;
        String check;
        double doubleOut;
        int counter = 0;

        File f = new File("C:\\My Library\\products.txt");
        Scanner scan = new Scanner(f);

        int a = 0;
        int i = 0;
        double totalsum = 0;

        while (scan.hasNextLine()) {
            System.out.println("==" + i++);

            if (scan.hasNextLine()) {
                check = scan.nextLine();

                if (check.contains(".") || check.matches(".*\\d.*")) {
                    doubleOut = Double.parseDouble(check);

                    if (counter == 0) {
                        price.add(doubleOut);
                        counter++;
                    } else {
                        amount.add(doubleOut);
                        counter = 0;
                    }

                } else {
                    products.add(check);
                }
            }
        }
        System.out.println(products);
        System.out.println(price);
        System.out.println(amount);
        products.removeAll(Arrays.asList(""));
        System.out.println(products);
        System.out.println(price);
        System.out.println(amount);

        addString(String.format("%-20s%-7s%-10s%-9s\n", "Наименование", "Цена", "Кол-во", "Стоимость"));
        addString(String.format("================================================\n"));
        for (a = 0; a < products.size(); a++) {
            double sum = price.get(a) * amount.get(a);
            totalsum = totalsum + sum;
            System.out.printf("%s: %.2f * %.2f = %.2f \n", products.get(a), price.get(a), amount.get(a), sum);
            addString(String.format("%-18s%6.2f%2s%7.2f%15.2f%n", products.get(a), amount.get(a), "x", price.get(a), sum));
        }
        addString("================================================\n");
        addString(String.format("%-41s%.2f","Итого:" ,totalsum));
        System.out.printf("Total sum is %.2f", totalsum);
    }

    public static void addString(String s) {
        try (FileWriter fw = new FileWriter("C:\\My Library\\receipt.txt",
                StandardCharsets.UTF_8, true)) {
            fw.append(s);
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}