package Array;

import java.util.HashSet;

public class TeemoAttacking_450 {
    public static void main(String[] args) {
        System.out.println(findPoisonedDuration(new int[]{1,2},2));
    }
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum=0,n=timeSeries.length;
        for(int i = 0; i < n-1; i++){
            //this one reset if overlap
            if(timeSeries[i]+duration-1 >= timeSeries[i+1]){
                sum+=timeSeries[i+1] - timeSeries[i];
            }else{
                //no overlap => full duration
                sum+=duration;
            }
        }
        //why add duration here
        //becase noone greater than the last element
        return sum+= duration;
    }


}
