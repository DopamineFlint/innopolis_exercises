package ru.baryshnikov.task8;

public class FoodException extends Exception {
    private String msg = "Фу, не хочу это есть!";

    public String startExc() {
        return msg;
    }
}
