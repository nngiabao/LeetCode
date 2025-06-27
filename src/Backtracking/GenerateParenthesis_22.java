package Backtracking;

import java.util.*;

public class GenerateParenthesis_22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtracking("",0,0,n,result);
        return result;
    }

    public void backtracking(String current,int open,int close,int max,List<String> result){
        //base case
        if(current.length() == max*2){
            result.add(current);
            return;
        }
        //open
        if(open < max){
            backtracking(current+"(",open+1,close,max,result);
        }
        // close
        if(close < open){
            backtracking(current+")",open,close+1,max,result);
        }
    }
}
