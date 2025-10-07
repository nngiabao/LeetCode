package SlidingWindow;

public class MaxCOnsecutive1s_1004 {
    public int longestOnes(int[] nums, int k) {
        int len = nums.length;
        int max = 0;
        for (int i = 0; i < len - k; i++) {
            int count = 0;
            int j = i;
            int temp = k;
            while (j < len) {
                if (nums[j] == 0){
                    if(temp > 0) temp--;
                    else break;
                }
                count++;
                j++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    //Solution 2:
    static{
        for(int i=0;i<400;i++){
            longestOnes2(new int[]{},0);
        }
    }
    public static int longestOnes2(int[] nums, int k) {
        int max=0;
        int c=-1;
        int i=0;
        for(int j=0;j<nums.length;j++){
            k-=(1-nums[j]);
            if(k<0){
                k+=(1-nums[i]);
                i++;
            }else{
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
    //SOlution 3:
    public int longestOnes3(int[] nums, int k) {
        int left = 0, right = 0;
        int zeroCount = 0;
        int maxLen = 0;

        while (right < nums.length) {
            if (nums[right] == 0) zeroCount++;

            while (zeroCount > k) {
                if (nums[left] == 0) zeroCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }

        return maxLen;
    }

}
