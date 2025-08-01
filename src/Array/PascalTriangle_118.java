package Array;

import java.util.*;

public class PascalTriangle_118 {
    public static void main(String[] args) {
        System.out.println(generate(3));

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        row.add(1);
        result.add(row);
        if (numRows == 1) return result;
        else {
            for (int i = 0; i < numRows-1; i++) {
                int j=1;
                List<Integer> curr_row = new ArrayList<>();
                row = new ArrayList<>();
                row = result.get(i);
                curr_row.add(1);

                while(j < i+1){
                    curr_row.add(row.get(j)+row.get(j-1));
                    j++;
                }
                curr_row.add(1);
                result.add(curr_row);
            }
        }
        return result;
    }
}
