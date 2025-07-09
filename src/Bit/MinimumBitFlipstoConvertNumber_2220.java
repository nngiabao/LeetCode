package Bit;

public class MinimumBitFlipstoConvertNumber_2220 {
    //Solution 1:Using built-in method
    public int minBitFlips(int start, int goal) {
//       convert into bit
        String bin_start = Integer.toBinaryString(start);
        String bin_goal = Integer.toBinaryString(goal);

        return 1;
    }
    //Solution 2:use my bin method
    public int minBitFlips2(int start, int goal) {
        String bin_start = bitConvert(start);
        String bin_goal = bitConvert(goal);
        int i=0;
        int j=0;
        int count=0;
        while(i<bin_goal.length() && j<bin_start.length()){
            if(bin_goal.charAt(i)!=bin_start.charAt(j)) count++;
            i++;
            j++;
        }
        return count;
    }


    //
    String bitConvert(int num) {
        StringBuilder sb = new StringBuilder();
        while(num > 0) {
            sb.append(num % 2);
            num /= 2;
        }
        return sb.reverse().toString();
    }
}