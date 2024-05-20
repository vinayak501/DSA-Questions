package org.example;

import java.util.Scanner;

public class codeforces_1806B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int zeros = 0;
            int res;
            boolean one = false;
            boolean Gone = false;
            int n = sc.nextInt();
            for (int i=0;i<n;i++){
                int a = sc.nextInt();
                if (a == 0){
                    zeros++;
                }else if(a == 1){
                    one = true;
                }else {
                    Gone = true;
                }
            }
            if (zeros > (n+1)/2){
                if (!one || Gone){
                    res = 1;
                }else {
                    res = 2;
                }
            }else {
                res = 0;
            }
            System.out.println(res);
        }
    }
}
