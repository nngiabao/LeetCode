package Array;

import java.util.*;

public class XKindDeck_914 {
    //Solution 1:
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //put into hash map
        for(int i = 0; i < deck.length; i++){
            map.put(deck[i], map.getOrDefault(deck[i], 0) + 1);
        }
        //check gcd if gcd >= 2 => correct
        //
        int gcd =0;
        for(Integer value : map.values()){
            gcd = gcd(gcd, value);
            if(gcd == 1) return false;
        }
        return true;
    }

    //gcd
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}
