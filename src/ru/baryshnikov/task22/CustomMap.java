package ru.baryshnikov.task22;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomMap {

    public static Map<String, Person> createMap()
    {
        Map<String, Person> book = new HashMap<>();
        Person person1 = new Person(29,"Petrova","female");
        Person person2 = new Person(34, "Sidorova", "female");
        Person person3 = new Person(34, "Tikhonova", "female");
        Person person4 = new Person(35, "Petrov", "male");
        book.put("Key1", person1);
        book.put("Key2", person1);
        book.put("Key3", person2);
        book.put("Key4", person3);
        book.put("Key5", person4);
        book.put("Key6", person4);
        return book;
    }

    public static void removeTheDuplicates(Map<String, Person> map) {
        Person val;
        for (Iterator<Person> it = map.values().iterator(); it.hasNext();) {
            val = it.next();
            //System.out.println(it.next());
            for (Iterator itt = map.entrySet().iterator(); itt.hasNext();) {
                if (val.equals(itt.next())) {
                    CustomMap.removeItemFromMapByValue(map, val);
                }
            }
        }


        //CustomMap.removeItemFromMapByValue(map, map.get("Key1")); //TEST!!!!
    }

    public static void removeItemFromMapByValue(Map<String, Person> map, Person value)
    {
        Map<String, Person> copy = new HashMap<>(map);
        for (Map.Entry<String, Person> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

}
