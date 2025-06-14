package PrefixSum;

public class MaxPopulationYear_1854 {
    //Solution 1: Using prefix sum
    public int maximumPopulation(int[][] logs) {
        if(logs.length == 1) return logs[0][0];
        //prefix sum
        int[] presum = new int[101];//1-100 we have range 100
        for(int i=0;i<logs.length;i++){
            presum[logs[i][0]-1950]++;
            presum[logs[i][1]-1950]--;
        }
        //
        int max = 0;
        int year=0;
        int currentPopulation = 0;
        for(int i=0;i<presum.length;i++){
            currentPopulation += presum[i];
            if(currentPopulation > max){
                max = currentPopulation;
                year = i+1950;
            }
        }
        return year;
    }
}
