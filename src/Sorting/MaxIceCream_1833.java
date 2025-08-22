package Sorting;

import java.util.Arrays;

public class MaxIceCream_1833 {
    public static void main(String[] args) {
        MaxIceCream_1833 a = new MaxIceCream_1833();
        int[] c = {1, 6, 3, 1, 2, 5};
        a.maxIceCream(c,20);

    }
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        //sort
        Arrays.sort(costs);
        //and find
        for(int num: costs){
            if(num > coins) return count;
            coins -= num;
            count++;
        }
        //
        return count;
    }
}
