package Greedy;

public class MinOperationsFlips_3192 {
    public int minOperations(int[] nums) {
        //
        int ops=0;//operation need to be flip
        //
        int current = 1;
        //
        for(int i=0;i<nums.length;i++){
            if(current != nums[i]){
                ops++;
                current = nums[i];
            }
        }
        return ops;
    }
}
