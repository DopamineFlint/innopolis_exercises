package ru.baryshnikov.task5;

import java.util.ArrayList;

public class Contract {
    private int number;
    private int date;
    private ArrayList<String> productList = new ArrayList<>();

    Contract() {

    }

    Contract(int number, int date, String product) {
        this.number = number;
        this.date = date;
        this.productList.add(product);
    }

    public int getNumber() {
        return number;
    }

    public int getDate() {
        return date;
    }

    public ArrayList<String> getProdList() {
        return productList;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public void addToList(String product) {
        this.productList.add(product);
    }
}
