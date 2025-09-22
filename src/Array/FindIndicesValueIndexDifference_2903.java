package Array;

public class FindIndicesValueIndexDifference_2903 {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        //
        int len = nums.length;
        //
        for(int i=0;i<len-indexDifference;i++) {
            for(int j=i+indexDifference;j<len;j++) {
                if(Math.abs(nums[i]-nums[j])>= valueDifference) return new int[]{i,j};
            }

        }
        //
        return new int[]{-1, -1};
    }
}
