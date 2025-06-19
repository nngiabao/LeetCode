package Array;

import java.lang.reflect.Array;
import java.util.*;
public class TwoOutOfThree_2032 {
    //Solution 1:Brute-force - built in method
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> res = new ArrayList<>();
        //sorting
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Arrays.sort(nums3);
        //case 1: array 1 and 2
        for(int num : nums1){
            if((BST(nums2,num)!=-1 || BST(nums3,num)!=-1) && !res.contains(num))
                res.add(num);
        }

       //case 2:array 2 and 3
        for(int num : nums2){
            if((BST(nums1,num)!=-1 || BST(nums3,num)!=-1) && !res.contains(num))
                res.add(num);
        }
        return res;
    }

    //build BS
    int BST(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }

    //Solution 2:better
    //Constrain small => build dictionary
    public List<Integer> twoOutOfThree2(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> result = new ArrayList<>();
        //
        int[] set1 = new int[nums1.length];
        int[] set2 = new int[nums2.length];
        int[] set3 = new int[nums3.length];
        //
        for(int num : nums1){
            set1[num]++;
        }
        //
        for(int num : nums2){
            set2[num]++;
        }
        //
        for(int num : nums3){
            set3[num]++;
        }
        //
        for(int i=0; i<set1.length; i++){
            if(set1[i]>=1 && set2[i]>=1 || set2[i]>=1 && set3[i]>=1 || set3[i]>=1 && set1[i]>=1){
                if(!result.contains(i)) result.add(i);
            }
        }

        return result;
    }
}
