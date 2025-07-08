package BST;

public class SearchRoatedSortedArray_33 {
    public int search(int[] nums, int target) {
        ///
        int left = 0, right = nums.length - 1;
        //
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            //check if left is sorted
            if (nums[left] <= nums[mid]){
                //if tart is in first half
                if(nums[left] < target && target < nums[mid]){
                    right = mid - 1;
                }else left = mid + 1;
            }else{//right is sorted
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else{
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
