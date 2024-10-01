package com.campusdual.classroom;

import javax.print.Doc;
import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {
        Map<String, Person> myMap = new HashMap<>();

        Person p = new Person("John", "Smith");
        Person t = new Teacher("María", "Montessori", "Educación");
        Person po = new PoliceOfficer("Jake", "Peralta", "B-99");
        Person d = new Doctor("Gregory", "House", "Nefrología e infectología");
        myMap.put("person", p);
        myMap.put("teacher", t);
        myMap.put("police", po);
        myMap.put("doctor", d);

        return myMap;
    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);
        return value;
    }

    public static void printMapValues(Map<String, Person> map) {
        map.forEach((k, v) -> v.getDetails());
    }
    
}
