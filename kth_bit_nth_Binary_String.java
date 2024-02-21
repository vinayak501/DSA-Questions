package org.example;

public class kth_bit_nth_Binary_String {
    public String findN(int n){
        if (n==1) return "0";
        String s = findN(n-1);
        String ans = s+"1";
        StringBuilder sb = new StringBuilder(s);
        for (int i=0;i<sb.length();i++){
            if (sb.charAt(i) == '1') sb.setCharAt(i,'0');
            else sb.setCharAt(i,'1');
        }
        sb.reverse();
        ans += sb.toString();
        return ans;
    }
    public char findKthBit(int n, int k) {
        String s = findN(n);
        return s.charAt(k-1);
    }

//************************************** 👇👇 JUST AWESOME 👇👇 **************************************************

    public char findKthBit_1(int n, int k) {
        //Base Condition
        if(n == 1){
            return '0';
        }

        int numberOfColumns = (int)Math.pow(2,n) - 1;
        int mid = numberOfColumns/2;

        if(k <= mid){
            return findKthBit(n-1,k);
        } else if (k == mid + 1){ //Since we are adding that extra "1" in each new row
            return '1';
        } else {
            k = numberOfColumns - k + 1;
            char c = findKthBit(n-1,k);
            return c == '0' ? '1' : '0';
        }
    }
}
