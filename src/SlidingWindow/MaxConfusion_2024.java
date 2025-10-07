package SlidingWindow;

public class MaxConfusion_2024 {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        return Math.max(getMax('T',k,answerKey),getMax('F',k,answerKey));
    }
    //write the method to return max 'T' or 'F' here
    public int getMax(char target , int k, String answerkey){
        int left =0, wrong =0;
        int maxLen = 0;

        while(left < answerkey.length()){
            if(answerkey.charAt(left) != target){
                wrong++;
            }
            //
            while(wrong > k){
                if (answerkey.charAt(left) == target){
                    wrong--;
                    left++;
                }
            }
            //check max length
            maxLen = Math.max(maxLen,wrong);
            left++;
        }
        return maxLen;
    }
}
