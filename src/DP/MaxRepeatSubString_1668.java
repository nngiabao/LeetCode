package DP;

public class MaxRepeatSubString_1668 {
    //Solution 1:Brute-force
    public int maxRepeating(String sequence, String word) {
        //
        int count=0;
        int i=0;
        StringBuilder sb = new StringBuilder();
        while(true){
            sb.append(word);
            if(sequence.contains(sb)) count++;
            else break;
        }
        return count;
    }

    //Solution 2:DP
    public int maxRepeating2(String sequence, String word) {
        //
        int len = word.length();
        int n = sequence.length();
        int[] dp = new int[n+1];//to store
        int max=0;
        for(int i=len;i<=n;i++){
            String s = sequence.substring(i-len,i);
            if(s.equals(word)){
                dp[i] = dp[i-len]+1;
                max = Math.max(max, dp[i]);
            }
        }
        return max;
    }
}
