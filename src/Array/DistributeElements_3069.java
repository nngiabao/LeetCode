package Array;

import java.util.*;

public class DistributeElements_3069 {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int arr[] = new int[nums.length];
        list1.add(nums[0]);
        list2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int a = list1.get(list1.size()-1);
            int b = list2.get(list2.size()-1);
            if(a>b) list1.add(nums[i]);
            else list2.add(nums[i]);
        }
        int arr1[] = new int[list1.size()];
        int arr2[] = new int[list2.size()];
        int k = 0;
        for(int i=0;i<list1.size();i++){
            arr[k++] = list1.get(i);
        }
        for(int i=0;i<list2.size();i++){
            arr[k++] = list2.get(i);
        }
        return arr;
    }
}
