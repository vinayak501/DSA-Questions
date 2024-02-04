package org.example;

public class remove_Star {
    static int containes(String sc){
        for(int i=0;i<sc.length();i++){
            if (sc.charAt(i) == '*') return i;
        }
        return -1;
    }
    public String removeStars(String s) {
        StringBuilder sc = new StringBuilder(s);
        int remove = containes(sc.toString());
        while (remove != -1){
            sc.deleteCharAt(remove);
            sc.deleteCharAt(remove-1);
            remove = containes(sc.toString());
        }
        return sc.toString();
    }
}
