package ru.baryshnikov.task8;

public class WbuChild {

    WbuChild() {

    }

    public void eat(Food food) {
        try{
            if ((food == Food.MEAT) || (food == Food.CARROT)) throw new FoodException();
            System.out.println("Наелся и спит");
        } catch (FoodException fe) {
            System.out.println(fe.startExc());
        } finally {
            System.out.println("Спасибо мама!");
            System.out.println("");
        }
    }
}
