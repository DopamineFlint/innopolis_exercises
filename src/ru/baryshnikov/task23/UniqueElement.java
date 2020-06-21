package ru.baryshnikov.task23;

import java.util.HashMap;
import java.util.Map;

public class UniqueElement {
    private static Map<Character, Integer> map = new HashMap<>();

    public static boolean checkForUnique(String str) {
        char[] chars = str.toCharArray();
        int counter = 0;
        boolean yN = false;
        boolean check = true;

        for (char c : chars) {
            for (char ch : chars) {
                if (c == ch) {
                    counter++;
                }
            }
            map.put(c, counter);
            if (counter < 2 && check) {
                System.out.println("First unique character is " + c);
                check = false;
                yN = true;
            }
            counter = 0;
        }
        return yN;
    }

    public static void getKeys() {
        System.out.println(map);
    }
}
