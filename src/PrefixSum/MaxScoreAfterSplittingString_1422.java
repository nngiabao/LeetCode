package PrefixSum;

public class MaxScoreAfterSplittingString_1422 {
    public static void main(String[] args) {
        MaxScoreAfterSplittingString_1422 a =new MaxScoreAfterSplittingString_1422();
        String s = "00";
        System.out.println(a.maxScore(s));;
    }
    //Solution 1: Brute force
    public int maxScore(String s) {
        int max = 0;
        for(int i = 0; i < s.length()-1; i++) {
            String leftStr = s.substring(0,i+1);
            String rightStr = s.substring(i+1,s.length());
            max = Math.max(max, countLeft(leftStr)+countRight(rightStr));
        }
        return max;
    }

    public int countLeft(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'==0) count++;
        }
        return count;
    }

    public int countRight(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'==1) count++;
        }
        return count;
    }
    //Solution 2: Using prefix sum
    public int maxScore2(String s) {
        int max = 0;
        for(int i = 1; i < s.length()-1; i++) {

        }
        return max;
    }
}
