package org.example;

import java.util.HashSet;
import java.util.Set;

public class NESW {
    public boolean isPathCrossing(String path) {
        int NS = 0;
        int EW = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        for (int i=0;i<path.length();i++){
            if (path.charAt(i) == 'N') NS++;
            else if (path.charAt(i) == 'S') NS--;
            else if (path.charAt(i) == 'E') EW++;
            else if (path.charAt(i) == 'W') EW--;
            String current = NS+","+EW;
            if (visited.contains(current)){
                return true;
            }
            visited.add(current);
        }
        return false;
    }
}
