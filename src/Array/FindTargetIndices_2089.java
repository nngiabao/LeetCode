package Array;
import java.util.*;

public class FindTargetIndices_2089 {
    //Solution 1: Using BST
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();
        int l=0, r=nums.length-1;
        while(l<r) {
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                res.addLast(mid);
                if(nums[mid+1] == target){
                    res.addLast(mid+1);
                    l = mid+1;
                }
                else if(nums[mid-1] == target){
                    res.addLast(mid-1);
                    r = mid-1;
                }
                else return res;
            }
            else if(mid<target) l=mid+1;
            else if(mid>target) r=mid-1;
        }
        return res;
    }

    //Solution 2:Using brute-force
    public List<Integer> targetIndices2(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == target) res.addLast(i);
        }
        return res;
    }
}
