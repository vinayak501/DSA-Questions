package org.example;

import java.util.ArrayList;
import java.util.List;

public class paranthisis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList();
        findAll("(",1,0,result,n);
        return result;
    }

    void findAll(String currrent,int o,int c,List<String> result,int n){
        if(currrent.length() == 2*n){
            result.add(currrent);
            return;
        }
        if(o<n)findAll(currrent+"(",o+1,c,result,n);
        if(c<o)findAll(currrent+")",o,c+1,result,n);
    }
}
