package PracticeQuestionForContest;

public class MaxTripletSum {
    public int maxSumDistinctTriplet(int[] x, int[] y) {
        //sliding window
        int maxSum = Integer.MIN_VALUE;
        //int i = 0, j = 1, k = 2;
        int len = x.length;
        for(int i = 0; i < len-2;i++ ){
            int j=i+1,k=i+2;
            if(x[i] != x[j] && x[i] != x[k] && x[j] != x[k]){
                int max_1 = Math.max(x[i],y[i]);
                int max_2 = Math.max(x[j],y[j]);
                int max_3 = Math.max(x[k],y[k]);
                maxSum = Math.max(maxSum, max_1+max_2+max_3);
            }
        }
        //
        return maxSum;
    }


}
