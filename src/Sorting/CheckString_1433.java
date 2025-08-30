package Sorting;

import java.util.Arrays;

public class CheckString_1433 {
    public boolean checkIfCanBreak(String s1, String s2) {
        //
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        //
        Arrays.sort(c1);
        Arrays.sort(c2);
        //
        boolean isDecrease = false, isIncrease = false;
        int i =0;
        while(i< c1.length){
            if(c1[i] > c2[i]){
                isDecrease = true;
                break;
            }else if(c1[i] < c2[i]){
                isIncrease = true;
                break;
            }
            i++;
        }
        //check isDecrease or isIncrease
        while (i < c1.length ){
            if((isDecrease && c1[i] >= c2[i]) || (isIncrease && c1[i] <= c2[i])) i++;
            else return false;
        }
        //
        return true;
    }
}
