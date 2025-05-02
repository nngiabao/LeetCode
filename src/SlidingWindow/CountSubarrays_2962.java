package SlidingWindow;

public class CountSubarrays_2962 {
    public long countSubarrays(int[] nums, int k) {
        //edge
        int len = nums.length;
        if (k > len)  return 0;
        long count=0;
        while(k<len){
            int temp=0;
            for(int i=0; i<k; i++){
                for(int j=i; j<k; j++){
                    
                }
            }
            k++;
        }
        return count;
    }
}
