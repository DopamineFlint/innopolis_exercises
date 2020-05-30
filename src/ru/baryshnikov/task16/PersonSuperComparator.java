package ru.baryshnikov.task16;

import java.util.*;

public class PersonSuperComparator {
    public static void main(String[] args) {
        Comparator psc = new Psc().thenComparing(new Pac());
        TreeSet<Person> people = new TreeSet<Person>(psc);
        people.add(new Person(27, "Roman"));
        people.add(new Person(13, "Roman"));
        people.add(new Person(44, "Roman"));
        people.add(new Person(34, "Natasha"));
        people.add(new Person(777, "Vasyan"));
        people.add(new Person(35, "Natasha"));


        for (Person p : people) {
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}


