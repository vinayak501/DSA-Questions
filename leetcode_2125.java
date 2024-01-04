package org.example;

public class leetcode_2125 {
    public int numberOfBeams(String[] bank) {
        int poc = 0;
        int ans = 0;
        for(String s : bank){
            int coc = 0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i) == '1')
                    coc++;
            }
            if(coc > 0){
                ans += poc*coc;
                poc = coc;
            }
        }
        return ans;
    }
}
