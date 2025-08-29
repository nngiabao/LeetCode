package Sorting;

import java.util.Arrays;

public class CanMakeAhrithmetric_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //
        if(arr.length == 2) return true;
        Arrays.sort(arr);
        int gap = arr[1] - arr[0];
        //
        for(int i=2; i<arr.length; i++) {
            if(arr[i] - arr[i-1] != gap) return false;
        }
        return true;
    }
}
