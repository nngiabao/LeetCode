package Backtracking;

public class SumAllSubsetXOR_1863 {
    public static void main(String[] args) {
        System.out.println(0^5^5);
    }
    int subsetXORSum(int[] nums) {
        //
        return backtrack(nums,0,0);
    }
    //
    int backtrack(int[] nums,int index,int currentXor){
        //base case
        if(index == nums.length){
            //when we finish all subset
            return currentXor;
        }
        int take = backtrack(nums, index+1, nums[index]^currentXor);
        int skip = backtrack(nums,index+1,currentXor);

        return take+skip;
    }
}
