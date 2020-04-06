package ru.baryshnikov.task5;

import java.util.ArrayList;

public class Act {
    private int number;
    private int date;
    private ArrayList<String> productList = new ArrayList<>();

    Act(int number, int date, ArrayList<String> productList) {
        this.number = number;
        this.date = date;
        this.productList = productList;
        System.out.println("This is act");
    }
}
