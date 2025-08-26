package Sorting;

import java.util.*;

//
public class MaxProduct2Digits_3536 {
    //Solution 1;
    public int maxProduct(int n) {
        //
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        //
        int len = list.size();
        Collections.sort(list);
        return list.get(len - 2) * list.get(len - 1);
    }

    //Solution 2:Brute-force => treat as a string
    public int maxProduct2(int n) {
        int max = 0, second_max = 0;
        while (n > 0) {
            int mod = n % 10;
            if(mod >= max){
                second_max = max;
                max = mod;
            }else if(mod > second_max){
                second_max = mod;
            }
            n /= 10;
        }
        return max*second_max;
    }

}
