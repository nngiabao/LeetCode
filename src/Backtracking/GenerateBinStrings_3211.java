package Backtracking;

import java.util.*;
public class GenerateBinStrings_3211 {
    public List<String> validStrings(int n) {
        //
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backtracking(res,"",n);
        return res;
    }

    void backtracking(List<String> res,String temp,int length){
        //base case
        if(length == temp.length()){
            res.add(temp.toString());
            return;
        }
        //always safe to add '1'
        backtracking(res,temp+"1",length);
        // Only add '0' if the last character is not '0'
        if(temp.isEmpty() || temp.charAt(temp.length()-1)!='0'){
            backtracking(res, temp + "0", length);
        }
    }
}
