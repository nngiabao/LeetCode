package BST;

public class FindFistAndLastIndex_34 {
    public int[] searchRange(int[] nums, int target) {
        //
        int len = nums.length;
        int left=0,right=len-1;
        int first=-1,last=-1;
        while(left <= right){
            //
            int mid=(left+right)/2;
            if(nums[mid]==target){
                first=mid;
                last = mid;
                break;
            }
            else if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        //find first
        while(first > 0 && nums[first-1]==target) first--;
        //find last
        while(last < len-1 && nums[last+1]==target) last++;
        //return
        return new int[]{first,last};
    }
}
