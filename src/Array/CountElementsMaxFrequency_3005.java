package Array;

public class CountElementsMaxFrequency_3005 {
    public int maxFrequencyElements(int[] nums) {
        //build cage
        int[] cage = new int[101];
         //
        int n = nums.length;
        for(int i = 0; i < n; i++){
            cage[nums[i]]++;
        }
        //find max
        int max = 0;
        for(int i = 1; i < 101; i++){
            if(cage[i] > 0) max = Math.max(max, cage[i]);
        }
         //find total
        int count=0;
        for(int i = 1; i < 101; i++){
            if(max == cage[i]) count+=max;
        }
        return count;
    }
}
