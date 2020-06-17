package ru.baryshnikov.task22;

import java.util.Map;

public class HashPersonTest {
    public static void main(String[] args) {
        Map<String, Person> sp = CustomMap.createMap();
        System.out.println(sp.get("Key1").getAge() + " " + sp.get("Key1").getLastName() + " "
                + sp.get("Key1").getSex());
        System.out.println(sp.get("Key2").getAge() + " " + sp.get("Key2").getLastName() + " "
                + sp.get("Key2").getSex());
        System.out.println(sp.get("Key3").getAge() + " " + sp.get("Key3").getLastName() + " "
                + sp.get("Key3").getSex());
        System.out.println(sp.get("Key4").getAge() + " " + sp.get("Key4").getLastName() + " "
                + sp.get("Key4").getSex());
        System.out.println(sp.get("Key5").getAge() + " " + sp.get("Key5").getLastName() + " "
                + sp.get("Key5").getSex());
        System.out.println(sp.get("Key6").getAge() + " " + sp.get("Key6").getLastName() + " "
                + sp.get("Key6").getSex());

        CustomMap.removeTheDuplicates(sp);

        System.out.println(sp);

        //System.out.println(sp.get("Key1").getSex());

    }
}
