package String;

import java.util.*;
//
public class CellsInARange_2194 {
    //Solution 1:
    public List<String> cellsInRange(String s) {
        //
        List<String> result = new ArrayList<>();
        char f_col = s.charAt(0);
        char l_col = s.charAt(3);
        int f_row = s.charAt(1)-'0';
        int l_row = s.charAt(4)-'0';
        //
        for(int i =(int) f_col; i <= (int) l_col; i++){
            String temp = ""+((char) i);
            for(int j= f_row; j<=l_row; j++){
                result.add(temp+j);
            }
        }
        //
        return result;
    }
    //Solution 2: Using 2D
    public List<String> cellsInRange2(String s) {
        int total = (s.charAt(3) - s.charAt(0) + 1) * (s.charAt(4) - s.charAt(1) + 1);
        List<String> result = new ArrayList<>(total);

        for (char col = s.charAt(0); col <= s.charAt(3); col++) {
            for (char row = s.charAt(1); row <= s.charAt(4); row++) {
                result.add(new String(new char[]{col, row}));
            }
        }
        return result;
    }

}
