package Array;

public class SumUniqueNums_1748 {
    //Solution 1:
    public int sumOfUnique(int[] nums) {
        /// /
        int sum = 0;
        int n = nums.length;
        int[] cage = new int[101];
        for(int i = 0; i < n; i++){
            cage[nums[i]]++;
        }
        //
        for(int i = 1; i < n; i++){
            if(cage[i]==1) sum+=i;
        }
        //
        return sum;
    }
}
