public class SearchInsertPosition_35 {
    public static void main(String[] args) {
        int []a = {1,3,5,6};int t = 5;
        System.out.println(searchInsert(a,t));

    }

    //BST
    public static int searchInsert(int[] nums, int target) {
        int left=0,right = nums.length - 1,mid;
        while(left<=right){
            mid = left+(right-left)/2;
            if(nums[mid]==target) return mid;
            if(nums[mid]<target) left=mid+1;
            else right=mid-1;
        }
        return left;
    }
}
