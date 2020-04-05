package ru.baryshnikov.task6;

public class AnimalTest {
    public static void main(String[] args) {
        Monkey mon = new Monkey();
        System.out.println(mon.getName());
        mon.running();
        mon.swimming();

        Pigeon pig = new Pigeon();
        System.out.println(pig.getName());
        pig.flying();

        Cat ct = new Cat();
        System.out.println(ct.getName());
        ct.running();
        ct.swimming();

        Driver driv = new Driver("Уася");
        driv.divingIn();
        driv.jogging();
        driv.running();
        driv.swimming();

        Killer killa = new Killer("Mr. Carpenter");
        killa.divingIn();
        killa.jogging();
        killa.running();
        killa.swimming();
    }
}

abstract class Human implements Run, Swim {
    String name;

    abstract String getName();
}

class Killer extends Human {
    Killer(String name) {
        this.name = name;
    }

    public void running() {
        System.out.println(name + " is running");
    }

    public void jogging() {
        System.out.println(name + " is jogging");
    }

    public void swimming() {
        System.out.println(name + " is swimming");
    }

    public void divingIn() {
        System.out.println(name + " is diving in");
    }

    String getName() {
        return name;
    }
}

class Driver extends Human {

    Driver(String name) {
        this.name = name;
    }

    public void running() {
        System.out.println(name + " is running");
    }

    public void jogging() {
        System.out.println(name + " is jogging");
    }

    public void swimming() {
        System.out.println(name + " is swimming");
    }

    public void divingIn() {
        System.out.println(name + " is diving in");
    }

    String getName() {
        return name;
    }
}

abstract class Animal {

    String name;

    abstract String getName();
}

class Monkey extends Animal implements Run, Swim {

    String name = "Monkey";

    public String getName() {
        return name;
    }

    public void running() {
        System.out.println(name + " is running");
    }

    public void jogging() {
        System.out.println(name + " is jogging");
    }

    public void swimming() {
        System.out.println(name + " is swimming");
    }

    public void divingIn() {
        System.out.println(name + " is diving in");
    }
}

class Pigeon extends Animal implements Fly  {
    String name = "Pigeon";

    public String getName() {
        return name;
    }

    public void flying() {
        System.out.println(name + " is flying");
    }

    public void flyingUp() {
        System.out.println(name + " is flying up");
    }
}

class Cat extends Animal implements Run, Swim {
    String name = "Cat";

    public String getName() {
        return name;
    }

    public void running() {
        System.out.println(name + " is running");
    }

    public void jogging() {
        System.out.println(name + " is jogging");
    }

    public void swimming() {
        System.out.println(name + " is swimming");
    }

    public void divingIn() {
        System.out.println(name + " is diving in");
    }
}

interface Fly {
    public void flying();
    public void flyingUp();
}

interface Run {
    public void running();
    public void jogging();
}

interface Swim {
    public void swimming();
    public void divingIn();
}
