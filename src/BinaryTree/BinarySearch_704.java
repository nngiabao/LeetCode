package BinaryTree;

public class BinarySearch_704 {
    public static void main(String[] args) {

    }

    //BST cuz sorted alr
    //return index
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1,mid;
        while (left <= right) {
             mid = left + (right - left) / 2;
             if(nums[mid] == target) return mid;
             if(nums[mid] < target) left = mid + 1;
             else right = mid - 1;
        }
        return -1;
    }

}
