package ru.baryshnikov.task19;

import java.util.*;

public class CheckUniqueTest {
    Map<String, String> map;
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<String, String>();

        names.put("Vasya", "Ivanov");
        names.put("Pyotr", "Petrov");
        names.put("Viktor", "Sidorov");
        names.put("Sergey", "Petrov");
        names.put("Vadim", "Viktorov");
        names.put("Mikhail", "Ivanov");
        System.out.println(names);

        CheckUniqueTest cut = new CheckUniqueTest();
        System.out.println(cut.isUnique(names));
    }

    public boolean isUnique(Map<String, String> map) {
        this.map = map;
        String word;
        boolean check = true;
        int counter = 0;

        for (Iterator<String> it = map.values().iterator(); it.hasNext();) {
            word = it.next();
            System.out.println("Word is " + word);
            for (Iterator<String> itt = map.values().iterator(); itt.hasNext();) {
                if (word.equals(itt.next())) {
                    counter++;
                    if (counter > 1) {
                        System.out.println("yep");
                        check = false;
                    }
                }
            }
            counter = 0;
        }
        return check;
    }
}
