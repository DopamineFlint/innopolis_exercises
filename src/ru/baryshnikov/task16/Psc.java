//person name comparator

package ru.baryshnikov.task16;

import java.util.*;

public class Psc implements Comparator<Person> {

    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }

}
