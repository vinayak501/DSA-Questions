package org.example;

public class longest_S_two_equal {
    public int maxLengthBetweenEqualCharacters(String s) {
        if(s.length()<2) return -1;
        if(s.length()==2){
            if(s.charAt(0) == s.charAt(1)) return 0;
            else return -1;
        }
        int ans =-1;
        for(int i=0;i<s.length();i++){
            for (int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    ans = Math.max(ans,j-i-1);
                }
            }
        }
        return ans;
    }
}
