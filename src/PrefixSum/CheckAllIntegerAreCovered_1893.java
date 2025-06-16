package PrefixSum;

public class CheckAllIntegerAreCovered_1893 {
    public boolean isCovered(int[][] ranges, int left, int right) {
        //coverage array
        int[] coverage = new int[52];
        for(int i=0;i<ranges.length;i++){
            coverage[ranges[i][1]+1]--; //end
            coverage[ranges[i][0]]++; //start
        }
        //
        int currentSum=0;//
        for(int i=1;i<=50;i++){
            //if current Sum == 0 =>  return false
            currentSum+=coverage[i];//this is accumulative prefix sum
            if(left <= i && i <= right && currentSum == 0) return false;
        }
        return true;
    }
}
