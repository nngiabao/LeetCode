package Array;

import java.util.HashSet;

public class DistributeCandies_575 {


    public static void main(String[] args) {

    }

    //Solution 1 - Hashset
    public static int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < candyType.length; i++) {
            if(set.contains(candyType[i])) {
                continue;
            }else{
                set.add(candyType[i]);
                if(set.size() > candyType.length/2-1) return set.size();
            }
        }
        return set.size();
    }

    //Array type
    public static int distributeCandies2(int[] candyType) {
        Boolean [] types = new Boolean[candyType.length];
        for(int i = 0; i < candyType.length; i++) {
            //if(candyType[i] != types )
        }
        //return set.size();
        return 1;
    }

}
