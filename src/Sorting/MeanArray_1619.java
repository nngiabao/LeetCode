package Sorting;

import java.util.Arrays;

public class MeanArray_1619 {
    public static void main(String[] args) {
        MeanArray_1619 a = new MeanArray_1619();
        int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        a.trimMean(arr);
    }
    //Solution 1:
    public double trimMean(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        //
        double sum = 0;
        int gap = n/20;
        for(int i = gap; i < n-gap ; i++) {
            sum += arr[i];
        }
        //
        return (double) sum/(n-gap*2);
    }
}
