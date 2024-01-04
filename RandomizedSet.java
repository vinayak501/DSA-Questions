package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomizedSet {
    Set<Integer> s;
    public RandomizedSet() {
        s = new HashSet<>();
    }

    public boolean insert(int val) {
        if(s.contains(val)) return false;
        else s.add(val); return true;
    }

    public boolean remove(int val) {
        if(!s.contains(val)) return false;
        else s.remove(val); return true;
    }

    public int getRandom() {
        List<Integer> clone = new ArrayList<>(s);
        int randomeI = (int) (Math.random() * s.size());
        return clone.get(randomeI);
    }
}
