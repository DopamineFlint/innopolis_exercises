package ru.baryshnikov.task18;

import java.util.*;

public class FilterTest {
    public static void main(String[] args) {
        ElemGroupFilter egf = new ElemGroupFilter();
        Set<String> set = new LinkedHashSet<String>();

        set.add("foo");
        set.add("buzz");
        set.add("bar");
        set.add("fork");
        set.add("bort");
        set.add("spoon");
        set.add("!");
        set.add("dude");

        System.out.println(egf.removeEvenLength(set));
    }
}
