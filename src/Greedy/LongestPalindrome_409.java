package Greedy;

import java.util.Hashtable;

public class LongestPalindrome_409 {
    //Count frequency of char
    //then take even-count times
    //if there exists 1 odd-count time => plus 1
    public int longestPalindrome(String s) {
        int count=0,i=0;
        boolean hasOdd=false; // this is flag to check we have odd to add at center

        Hashtable<Character,Integer> table = new Hashtable();
        while(i<s.length()){
            char c = s.charAt(i);
            table.put(c,table.getOrDefault(c,0)+1);
            i++;
        }
        for(Integer value:table.values()){
                count+= (value/2) *2;
            //check has ood
            if((value & 1) == 1) hasOdd = true;
        }

        return hasOdd ? ++count : count;
    }
}
