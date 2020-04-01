package ru.baryshnikov.task3;

import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> studs = new ArrayList<Student>();
    private int i = 0;

    University() {

    }

    University(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void opened() {
        System.out.println(name + " is opened");
    }

    public void closed() {
        System.out.println(name + " is closed");
    }

    public void addStud(Student stoods) {
        studs.add(stoods);
        System.out.println("student added: " + studs.get(i).getName() + " " + studs.get(i).getAge());
        i++;
    }

    public void showAllStoods() {
        for (Student f:studs)
        System.out.println(f.getName() + " " + f.getAge() + " " + f.getUniv());
    }

    public void showLength() {
        System.out.println(studs.size());
    }

}
