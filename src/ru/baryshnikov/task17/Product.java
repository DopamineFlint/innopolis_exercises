package ru.baryshnikov.task17;

public class Product {
    String name;
    int count;

    Product() {

    }

    Product (String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() {
        return this.count;
    }
}
