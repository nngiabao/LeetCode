package Array;

import java.util.HashSet;
import java.util.*;

public class ThreeDigitEvenNum_2094 {
    public static void main(String[] args) {
        ThreeDigitEvenNum_2094 a = new ThreeDigitEvenNum_2094();
        int[] c = {2, 1, 3, 0};
        ;
        for(int i : a.findEvenNumbers(c)){
            System.out.println(i);
        }
    }

    //Solution 1:bad
    public int[] findEvenNumbers(int[] digits) {
        //create i,j,k
        //j = i+1,k = i+2
        //using hash set to find unique
        Set<Integer> set = new HashSet<>();
        int i = 0, j = 0, k = 0, n = digits.length;
        while (i < n) {
            if (digits[i] != 0) {
                while (j < n) {
                    if (j != i) {
                        //different num
                        while (k < n) {
                            if (k != j && k != i && (digits[k] & 1) == 0) {
                                int digit = digits[i] * 100 + digits[j] * 10 + digits[k];
                                set.add(digit);
                            }
                            k++;
                        }

                    }
                    k=0;
                    j++;
                }
            }
            j=0;
            i++;
        }//
        //we cant convert set to list directly
        //we need to use list
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res.stream().mapToInt(x -> x).toArray();
    }
}
