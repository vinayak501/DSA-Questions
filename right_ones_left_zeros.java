package org.example;

public class right_ones_left_zeros {
    static int maxScore(String s) {
        int answer = 0;
        int Zeros = 0;
        int Ones = (int) s.chars().filter(ch -> ch == '1').count();
        for (int i=0;i<s.length();i++){
            Zeros += s.charAt(i) == '0' ? 1 : 0;
            Ones -= s.charAt(i) == '1' ? 1 : 0;
            answer = Math.max(answer , Zeros + Ones);
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "001101";
        int a = maxScore(s);
        System.out.println(a);
    }
}
