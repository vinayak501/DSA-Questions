package org.example;

public class sqrt {
    public static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int res = 0;
        while(end>=start){
            int mid = start + (end - start)/2;
            if(mid <= x/mid){
                res = mid;
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int x =9;
        int a = mySqrt(x);
    }
}
