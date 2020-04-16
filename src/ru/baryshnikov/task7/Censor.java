package ru.baryshnikov.task7;

public class Censor {
    String str;

    Censor() {
        System.out.println("Censor is created");
    }

    public void useCensor(String oldString) {
        if (oldString.contains("byaka")) {
            str = oldString.replace("byaka", "|CENSORED|");
            System.out.println(str);
        }

        if (oldString.contains("BYAKA")) {
            str = oldString.replace("BYAKA", "|CENSORED|");
            System.out.println(str);
        }
    }
}
