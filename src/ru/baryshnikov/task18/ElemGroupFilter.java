package ru.baryshnikov.task18;

import java.util.*;

public class ElemGroupFilter {
    private int i = 0;
    private Set<String> set = new LinkedHashSet<String>();

    public Set<String> removeEvenLength(Set<String> set) {
        this.set = set;
        Iterator<String> iter = this.set.iterator();

        while (iter.hasNext()) {
            String str = iter.next();

            if ((str.length() % 2) == 0) {
                iter.remove();
            }
        }

        return this.set;
    }
}
