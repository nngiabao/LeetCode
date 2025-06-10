package BST;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class SpecialArrayWithX_1608 {
    //Solution 1:Brute-force
    public int specialArray(int[] nums) {
        for(int x=0;x<=nums.length;x++){
            int count =0;
            for(int num : nums){
                if(num >= x) count++;
            }
            if(count == x) return x;
        }
        return -1;
    }

    //SOlution 2:Using BST
    public int specialArray2(int[] nums) {
        //Sort
        Arrays.sort(nums);
        int len = nums.length;
        for(int x=0;x<=len;x++){
            //BST => search x
            int left = 0, right = len;
            //find first index of nums[i]>=x
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] >= x) right = mid;
                else left = mid + 1;
            }
            //f
            if (len-left == x) return x;
        }
        return -1;
    }
}
