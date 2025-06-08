package Array;

import java.util.*;

public class CoinChangeII_518 {
    public int change(int amount, int[] coins) {
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0; i<coins.length; i++){
            List<Integer> res = new ArrayList<>();
            int[] dp = new int[i+1];
            for(int j=0; j<=i; j++){

            }
        }
        return set.size();
    }
}
