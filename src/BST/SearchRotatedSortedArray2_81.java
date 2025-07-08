package BST;

public class SearchRotatedSortedArray2_81 {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            //
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return true;
            //check duplicate first
            if(nums[mid] == nums[left] && nums[mid] == nums[right]){
                right--;
                left++;
            }
            //
           else if (nums[left] <= nums[mid]) { //left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                }else left = mid + 1;
            }else{
                if(nums[mid] < target && target <= nums[right]){
                   left = mid + 1;
                }else  right = mid - 1;
            }
        }
        return false;
    }
}
