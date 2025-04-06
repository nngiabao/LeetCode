package String;

import java.util.ArrayList;
import java.util.List;

public class CountBinarySubstrings_696 {
    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }
    //Solution 1: Bad version
    public static int countBinarySubstrings(String s) {
        List<Integer> list = new ArrayList<Integer>();
        int count = 0,start=0,i=1;
        //count freq consecutive 0 or 1
        while(i<= s.length()){
            if(i== s.length() || s.charAt(i) != s.charAt(i-1)) {
                list.add(i-start);
                start = i;
            }
            i++;
        }
        //start to check sub string
        for(int j=1;j<list.size();j++){
            count += Math.min(list.get(j),list.get(j-1));
        }
        return count;
    }
}
