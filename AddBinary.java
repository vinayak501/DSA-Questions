package org.example;

public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int n1 = a.length() - 1;
        int n2 =b.length() - 1;
        int c = 0;
        int base = 2 ;
        while (n1 >=0 || n2>=0){
            int t1=0,t2=0,sum;
            if (n1 >= 0){
                t1 = a.charAt(n1--) - '0';
            }
            if(n2>=0){
                t2 = b.charAt(n2--) - '0';
            }
            sum = t1 +t2 +c;
            if(sum>=base){
                sum = sum - base;
                c = 1;
            }else {
                c=0;
            }
            sb.append(sum);
        }
        if(c==1){
            sb.append(c);
        }
        return sb.reverse().toString();
    }
}
