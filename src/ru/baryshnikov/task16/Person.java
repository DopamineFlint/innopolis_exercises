package ru.baryshnikov.task16;

public class Person {
    int age;
    String name;

    Person (int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
