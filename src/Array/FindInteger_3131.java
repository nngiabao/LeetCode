package Array;

import java.util.Arrays;

public class FindInteger_3131 {
    //Solution 1:
    public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        return nums2[0] - nums1[0];
    }
    //Solution 2:best
    public int addedInteger2(int[] nums1, int[] nums2) {
        int sum = 0;
        for(int i=0;i<nums1.length;i++){
            sum += nums2[i]-nums1[i];
            //
        }
        return sum/nums1.length;
    }
}
