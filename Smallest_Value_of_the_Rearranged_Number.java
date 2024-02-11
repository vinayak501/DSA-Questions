package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class Smallest_Value_of_the_Rearranged_Number {
    private void swap(char ch[], int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
    public long smallestNumber(long num) {
        if(num > 0) {
            String str = String.valueOf(num);
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            if(ch[0] == '0') {
                int i = 1;
                while(i < ch.length && ch[i] == '0') {
                    i++;
                }
                if(i < ch.length) {
                    swap(ch, 0, i);
                }
            }
            String newStr = String.valueOf(ch);
            return Long.parseLong(newStr);
        }
        else {
            String str = String.valueOf(-num);
            char ch[] = str.toCharArray();
            Character chObjs[] = new Character[ch.length];
            for (int i = 0; i < ch.length; i++) {
                chObjs[i] = ch[i];
            }
            Arrays.sort(chObjs, Comparator.reverseOrder());
            for (int i = 0; i < ch.length; i++) {
                ch[i] = chObjs[i];
            }
            String newStr = "-" + new String(ch);
            return Long.parseLong(newStr);
        }
    }
}
