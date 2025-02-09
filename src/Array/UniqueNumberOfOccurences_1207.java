package Array;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueNumberOfOccurences_1207 {
    public boolean uniqueOccurrences(int[] arr) {
        if(arr == null || arr.length == 0) return true;
        if (arr.length == 2 && arr[0] != arr[1]) return false;
        //sorted
        Arrays.sort(arr);
        //set to save occurences
        HashSet<Integer> set = new HashSet<>();
       //variable to save previous value
        int val=arr[0],count = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != val){
                if(set.contains(count)) return false;
                set.add(count);
                val=arr[i];
                count=1;
            }else count++;
        }
        return (set.contains(count)) ? false : true;
    }
}
