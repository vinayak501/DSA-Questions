package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class destination {
    public String destCity(List<List<String>> paths) {
        Set<String> from = new HashSet<>();
        for(List<String> cities:paths){
            from.add(cities.get(0));
        }
        for (List<String> cities : paths){
            String des = cities.get(1);
            if (!from.contains(des)) return des;
        }
        return "not found";

    }
}
