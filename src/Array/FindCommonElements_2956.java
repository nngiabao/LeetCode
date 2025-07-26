package Array;

import java.util.*;

public class FindCommonElements_2956 {
    //Solution 1:using hash map
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Build sets
        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);

        int count1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) count1++;
        }

        int count2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) count2++;
        }

        return new int[] {count1, count2};
    }
    //Solution 2:Using 2 pointers
    class Solution {
        public int[] findIntersectionValues(int[] nums1, int[] nums2) {
            int c1=0,c2=0;
            for(int i=0;i<nums1.length;i++){
                int a=nums1[i];
                for(int j=0;j<nums2.length;j++){
                    if(a==nums2[j]){
                        c1++;
                        break;
                    }
                }
            }
            for(int i=0;i<nums2.length;i++){
                int a=nums2[i];
                for(int j=0;j<nums1.length;j++){
                    if(a==nums1[j]){
                        c2++;
                        break;
                    }
                }
            }
            return new int[]{c1,c2};
        }
    }
}
