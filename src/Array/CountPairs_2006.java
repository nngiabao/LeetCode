package Array;

public class CountPairs_2006 {
    public int countKDifference(int[] nums, int k) {
        //because Constraints are small => build dictionary
        int[] dictionary = new int[101];
        //
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            dictionary[nums[i]]++;
        }
        //count pairs
        for(int i = 1; i < 101-k; i++){
            count += dictionary[i]*dictionary[i+k];
        }
        return count;
    }
}
