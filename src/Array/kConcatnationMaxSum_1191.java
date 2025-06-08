package Array;

public class kConcatnationMaxSum_1191 {
    public int kConcatenationMaxSum(int[] arr, int k) {
        int sum = 0;
        int len = arr.length;
        //
        int[] dp = new int[len*k];
        dp[0] = arr[0];
        int max=arr[0];
        //
        for(int i = 1; i < len*k; i++){
            int index = i%len;
            dp[i] =  Math.max(dp[i-1]+arr[index],arr[index]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    //Kadane's algo
    int Kadane(int[] nums){
        //
        int currentSum = 0;
        int maxSum = 0;
        for(int num : nums){
            currentSum += num;
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
