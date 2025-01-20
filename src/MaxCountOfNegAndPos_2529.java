public class MaxCountOfNegAndPos_2529 {
    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-3,-2,-1,0,0,1,2}));
    }

    public static int maximumCount(int[] nums) {
        int left =0, right = nums.length - 1,mid;
        //count pos
        while (left <= right) {
            mid = left + (right-left) /2;
            if (nums[mid] > 0) right = mid-1;
            else left = mid+1;
        }
        int countPos = nums.length-left;
        //count neg
        right=left-1;left=0; // reset again to count exact last neg
        while(left <= right) {
            mid = left + (right-left) /2;
            if (nums[mid] < 0) left = mid+1;
            else right = mid-1;
        }
        int countNeg = left-0;
        return Math.max(countPos, countNeg);
    }
}
