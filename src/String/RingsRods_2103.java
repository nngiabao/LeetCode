package String;

import java.util.*;

public class RingsRods_2103 {
    //Solution 1:basic
    public int countPoints(String rings) {
        ///
        HashMap<Integer, Set<Character>> map = new HashMap<>();
        ///
        for (int i = 1; i < rings.length(); i += 2) {
            int rods = rings.charAt(i) - '0';
            char ring = rings.charAt(i - 1);
            //
            if (!map.containsKey(rods)) {
                map.put(rods, new HashSet<>());
            }
            //
            map.get(rods).add(ring);
        }
        ///count
        int count = 0;
        for (Integer rods : map.keySet()) {
            if (map.get(rods).size() == 3) count++;
        }
        ///
        return count;
    }

    //Solution 2: Using array
    public int countPoints2(String rings) {
        //
        int n = rings.length();
        //count rods
        boolean[] red = new boolean[10];
        boolean[] green = new boolean[10];
        boolean[] blue = new boolean[10];
        //
        for(int i = 0; i < n; i+=2) {
            char ch = rings.charAt(i);
            int index = rings.charAt(i+1) - '0';
            if(ch == 'R') red[index] = true;
            else if(ch == 'G') green[index] = true;
            else if(ch == 'B') blue[index] = true;
        }
        ///
        int count = 0;
        for(int i=0;i<10;i++){
            if(red[i] && green[i] && blue[i]) count++;
        }
        ///
        return count;
    }
}
