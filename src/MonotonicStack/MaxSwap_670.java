package MonotonicStack;

public class MaxSwap_670 {
    public int maximumSwap(int num) {
        //convert to char array
        char[] arr = Integer.toString(num).toCharArray();
        //find first max
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int len = arr.length;
        int max_index = 0;
        int min_index = 0;
        for(int i=0; i<len; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //find min from right to left
        for(int i=len-1; i>=0; i--){

        }
        //if(max_index > min_index) return num;
        return 1;
    }
}
