package Greedy;

public class MinOperators_1827 {
    public static void main(String[] args) {
        int[] a = {1,1,1};
        MinOperators_1827 b = new MinOperators_1827();
        System.out.println(b.minOperations(a));
    }

    public int minOperations(int[] nums) {
        if(nums.length == 1) return 0;
        int count = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] <= nums[i-1]){
                int gap = nums[i-1] - nums[i]+1;
                nums[i] += gap;
                count+= gap;
            }
        }
        return count;
    }
}
