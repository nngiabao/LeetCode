package Array;

public class SmallestIndex_3550 {
    public int smallestIndex(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            //count sum digit
            while(nums[i] > 0){
                sum += nums[i]%10;
                nums[i]/=10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}
