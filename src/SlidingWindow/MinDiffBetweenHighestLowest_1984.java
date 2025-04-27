package SlidingWindow;

import java.util.Arrays;

public class MinDiffBetweenHighestLowest_1984 {
    public static void main(String[] args) {
        MinDiffBetweenHighestLowest_1984 a = new MinDiffBetweenHighestLowest_1984();
        //int[] c = {41900,69441,94407,37498,20299,10856,36221,2231,54526,79072,84309,76765,92282,13401,44698,17586,98455,47895,98889,65298,32271,23801,83153,12186,7453,79460,67209,54576,87785,47738,40750,31265,77990,93502,50364,75098,11712,80013,24193,35209,56300,85735,3590,24858,6780,50086,87549,7413,90444,12284,44970,39274,81201,43353,75808,14508,17389,10313,90055,43102,18659,20802,70315,48843,12273,78876,36638,17051,20478};
      int[] d = {9,4,1,7};
        System.out.println(a.minimumDifference(d,2));

    }
    //Solution 1: Sorting
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1 || k==1) return 0;
        Arrays.sort(nums);
        //min in slide window
        int min = Math.min(Integer.MAX_VALUE,nums[k-1]-nums[0]);
        //keep sliding
        int i=1,j=k;
        while(j<nums.length){
            min=Math.min(min,nums[j]-nums[i]);
            j++;
            i++;
        }
        return min;
    }
    //Solution 2: slide window
    public int minimumDifference2(int[] nums, int k) {
        if(nums.length == 1) return nums[0];
        int min = Integer.MAX_VALUE;
        //int i=0,j =1;
        //slide window
        for(int i=0;i<nums.length;i++){
            //
        }
        //


        return min;
    }
}
