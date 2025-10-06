package BST;

public class FindPeakElement_162 {
    //Solution 1:Brute-force
    public int findPeakElement(int[] nums){
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return i-1;
        }
        return 0;
    }
    //Solution 2:BST
    public int findPeakElement2(int[] nums) {
        if(nums.length==1) return -1;
        //
        int len = nums.length;
        int left=0,right=len-1;
        while(left<right){
            int mid = left+(right-left)/2;
            //peek in the left side (including the mid)
            if(nums[mid] > nums[mid+1]) right = mid;
            //peek in the right side
            else left = mid+1;
        }
        return left;
    }
}
