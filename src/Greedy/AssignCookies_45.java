package Greedy;

import java.util.Arrays;

public class AssignCookies_45 {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0, i = 0, j = 0 ;
        //sort array
        Arrays.sort(g);
        Arrays.sort(s);
        while (i < g.length && j < s.length) {
            if( s[j] >= g[i] ){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
}
