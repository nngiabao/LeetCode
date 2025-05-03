package Array;

import java.util.*;
public class MinAbsoluteDiff_1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //Sort array first
        Arrays.sort(arr);
        //find the min diff
        int min = Integer.MAX_VALUE;
        //
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 1; i < arr.length; i++){
            min = Math.min(min, Math.abs(arr[i] - arr[i - 1]));
        }

        //
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] == min) res.add(new ArrayList<>(List.of(arr[i-1], arr[i])));
        }
        return res;
    }
}
