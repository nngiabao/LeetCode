package Array;

public class CountEqual_2176 {
    //Solution 1:Brute-force
    public int countPairs(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j] && i*j % k == 0) count++;
            }
        }
        return count;
    }
    //Solution 2:Using recursion - best
}
