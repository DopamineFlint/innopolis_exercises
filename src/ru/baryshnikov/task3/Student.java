package ru.baryshnikov.task3;

public class Student {
    private String name;
    private int age;
    private String univ;

    Student() {
    }

    Student(String name, int age, String univ) {
        this.name = name;
        this.age = age;
        this.univ = univ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniv() {
        return univ;
    }

    public void go() {
        System.out.println(name + " is going to university " + univ);
    }

    public void studying() {
        System.out.println(name + " is studying in " + univ);
    }
}
