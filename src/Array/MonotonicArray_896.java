package Array;

public class MonotonicArray_896 {
    public boolean isMonotonic(int[] nums) {
        if(nums.length < 3) return true;
        boolean isIncreasing = true,isDecreasing = true;
        int i=1;
        while((isDecreasing || isIncreasing) && i < nums.length) {
            if(nums[i] > nums[i-1]) isDecreasing = false;
            if(nums[i] < nums[i-1]) isIncreasing = false;
        }
        return (isDecreasing || isIncreasing) ? true : false;
    }
}
