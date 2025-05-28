package SlidingWindow;

import java.util.HashSet;

public class GoodSubString_1876 {
    public static void main(String[] args) {
        String s ="xyzzaz";
        GoodSubString_1876 a = new GoodSubString_1876();
        System.out.println(a.countGoodSubstrings(s));
    }

    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        //find first window
        HashSet<Character> set = new HashSet<Character>();
        int count=0;
        for(int i = 0; i < 3; i++) {
            set.add(s.charAt(i));
        }
        if(set.size() == 3) count++;
        //
        for(int i = 3; i < s.length(); i++) {
           //
            set = new HashSet<Character>();
            for (int j = 0; j < 3; j++) {
                set.add(s.charAt(i-j));
            }
            if (set.size() == 3) count++;
        }
        return count;
    }
    //Solution 2:Best
    public int countGoodSubstrings2(String s) {
        int count=0;
        for(int i=0;i<s.length()-2;i++) {
            char a = s.charAt(i);
            char b = s.charAt(i+1);
            char c = s.charAt(i+2);
            if( a != b && a != c && b != c) count++;
        }
        return count;
    }
}
