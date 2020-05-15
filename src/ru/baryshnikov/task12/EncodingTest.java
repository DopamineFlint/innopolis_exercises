package ru.baryshnikov.task12;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class EncodingTest {

    private static String fileIn = "C:\\My Library\\in.txt";
    private static String fileOut = "C:\\My Library\\out.txt";

    public static void main(String[] args) {
        copyAndEncode();
    }

    public static void copyAndEncode() {
        try (FileWriter fw = new FileWriter(fileOut, Charset.forName("KOI8-R"));
             FileReader fr = new FileReader(fileIn, StandardCharsets.UTF_8)) {

            fr.transferTo(fw);

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
