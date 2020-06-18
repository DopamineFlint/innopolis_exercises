package ru.baryshnikov.task22;

import java.util.Map;

public class HashPersonTest {
    public static void main(String[] args) {
        Map<String, Person> sp = CustomMap.createMap();

        System.out.println(CustomMap.getMapAsString(sp));

        CustomMap.removeTheDuplicates(sp);

        System.out.println("======");
        System.out.println(CustomMap.getMapAsString(sp));
    }
}
