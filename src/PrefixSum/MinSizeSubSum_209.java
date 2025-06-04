package PrefixSum;

import javax.xml.stream.events.StartDocument;

public class MinSizeSubSum_209 {
    public static void main(String[] args) {
        MinSizeSubSum_209 a = new MinSizeSubSum_209();
        int[] t = {2,3,1,2,4,3};
        System.out.println(a.BST(t,11));
        System.out.println(a.minSubArrayLen(7,t));
    }

    public int minSubArrayLen(int target, int[] nums) {
        //prefix sum array
        if (nums == null || nums.length == 0) return 0;
        //
        int len = nums.length;
        int[] presum = new int[len];
        presum[0] = nums[0];
        //
        for (int i = 1; i < len; i++) {
            presum[i] = nums[i] + presum[i - 1];
        }
        //find position where we have to start to scan
        int start = BST(presum, target);
        if( start == len-1 && target > presum[start]) return 0;
        //
        //
        int min =Integer.MAX_VALUE;
        //
        for(int i=start;i<len;i++){
            for(int j=i;j>=0;j--){
                int left = (j==0) ? 0 : presum[j-1];
                int sum= presum[i]-left;
                if(target <= sum){
                    min = Math.min(min,i-j+1);
                    if(min==1) return 1;
                    break;
                }
            }
        }
        return min;
    }

    int BST(int[] array, int target) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (array[mid] == target) return mid;
            if (array[mid] < target) l = mid + 1;
            else r = mid - 1;
        }
        return r;
    }

    //Solution 2:Sliding window
}
