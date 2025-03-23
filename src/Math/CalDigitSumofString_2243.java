package Math;

import java.lang.reflect.Array;
import java.util.*;

public class CalDigitSumofString_2243 {
    //Solution 1
    public String digitSum(String s, int k) {
        ArrayList<String> list = new ArrayList<>(devideBlocks(s,k));int i=0;
        StringBuilder sb = new StringBuilder();
        //devide string s into small k strings
        while(list.size()> 1) {
            while(i < list.size()) {
                String child = list.get(i);
                //sum

                sb.append(child);
                i++;
            }
            list = devideBlocks(sb.toString(),k);
        }

        return list.get(0);
    }

    //put String into many blocks
    public ArrayList<String> devideBlocks(String s,int k){
        ArrayList<String> list = new ArrayList<>();int i=0;
        while(i < s.length()) {
            list.add(s.substring(i,i+k));
            i += k;
        }
        if (i < s.length()) list.add(s.substring(i,s.length()));
        return list;
    }
    //sum digit
    public String sumDigit(String s){
        return "";
    }

}
