package ru.baryshnikov.task9;

public class Drinks {
    private String name;
    private int price = 0;

    Drinks() {

    }

    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
