package PrefixSum;

public class SumAllOddLengthSubarrays_1588 {
    public static void main(String[] args) {
        int [] a= {1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(a));
    }
    public static int sumOddLengthSubarrays(int[] arr) {
        //count prefix array
        int length = arr.length;
        int [] prefix = new int [length];
        prefix[0] = arr[0];
        for(int i=1; i<length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        //if only 1-2 elements
        if(length < 3) return prefix[length-1];
        int i=3,sum=0;
        while(i<length){
            //assume flag is wrong
            //check edcase
            int j=length;
            //if(i==arr.length) sum+=prefix[j-1];
            while(j-i>=0){
                //edge case
                if(j-i==0) sum+=prefix[j-1];
                else sum+= prefix[j-1]-prefix[j-i-1];
                j--;
            }
            i+=2;
        }
        boolean isOdd = (length%2!=0) ? true : false;
        return (isOdd) ? sum+prefix[length-1]*2 : sum+prefix[length-1];
    }
}
