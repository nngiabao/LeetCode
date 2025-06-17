package Greedy;

import java.util.Arrays;

public class MaxNumCoinsYouGet_1561 {
    //
    public int maxCoins(int[] piles) {
        //
        Arrays.sort(piles);
        int sum = 0;
        //bob always pick the min pile
        int i=piles.length-2,bob_piles=0;
        while(i>bob_piles){
            sum+=piles[i];
            bob_piles++;
            i-=2;
        }
        return sum;
    }
}
