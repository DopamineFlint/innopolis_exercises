package ru.baryshnikov.task5;

public class ConCountTest {
    public static void main(String[] args) {
        ConstructorCounter cc = new ConstructorCounter();
        ConstructorCounter cc1 = new ConstructorCounter();
        ConstructorCounter cc2 = new ConstructorCounter();
        ConstructorCounter cc3 = new ConstructorCounter();

        System.out.println("");

        ConstructorCounter.counter();
    }
}

class ConstructorCounter {
    private static int counter = 0;

    ConstructorCounter() {
        counter++;
        System.out.println("this class was created " + counter + " times");
    }

    public static void counter() {
        System.out.println("this class was created " + counter + " times");
    }
}
