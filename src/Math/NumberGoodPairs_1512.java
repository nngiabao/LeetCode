package Math;

public class NumberGoodPairs_1512 {
    //Solution 1:Using array
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) count++;
            }
        }
        return count;
    }
    //Solution 2: using hash map
    //Solution 3: using array if input is small
    public int numIdenticalPairs3(int[] nums) {
        int count = 0;
        int[] freq = new int[101]; // Assuming nums[i] is between 0 and 100
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }
}
