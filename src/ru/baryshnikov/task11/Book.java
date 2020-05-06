package ru.baryshnikov.task11;

import java.io.Serializable;

public class Book implements Serializable {
    private String name;
    private String author;
    private int year;
    private String text;

    Book(String name, String author, int year, String text) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.text = text;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    int getYear() {
        return year;
    }

    String getText() {
        return text;
    }
}
