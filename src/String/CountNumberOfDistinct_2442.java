package String;

import java.util.*;
import java.util.Set;

public class CountNumberOfDistinct_2442 {
    //Solution 1:Not good
    public int countDistinctIntegers(int[] nums) {
        //
        Set<Integer> set = new HashSet<>();
        //
        for (int num : nums) {
            set.add(num);
            set.add(reverse(num));
        }
        //
        return set.size();
    }
    //reverse
    int reverse(int x) {
        int newNum = 0;
        while(x > 0){
            newNum = newNum * 10 + x % 10;
            x /=10;
        }
        return newNum;
    }
    //SOlution 2:
    public int countDistinctIntegers2(int[] nums) {
        boolean[] seen = new boolean[1000001];
        int count = 0;
        for(int num : nums) {
            if(!seen[num]) {
                seen[num] = true;
                count++;
            }
            int x = 0;
            while(num > 0) {
                x = x * 10 + num % 10;
                num /= 10;
            }
            if(!seen[x]) {
                count++;
                seen[x] = true;
            }
        }
        return count;
    }
}
