package Bit;

public class DecodeXORArray_1720 {
    public int[] decode(int[] encoded, int first) {
        //
        int[] result = new int[encoded.length+1];
        //
        result[0] = first;
        for(int i=1; i<result.length; i++) {
            result[i] = encoded[i-1] ^ result[i-1];
        }
         //
        return result;
    }
    //Solution 2:
    class Solution {
        static{
            for(int i=0;i<600;i++) decode( new int[0],0);
        }
        public static int[] decode(int[] encoded, int first) {
            int n=encoded.length;
            int arr[]=new int[n+1];
            arr[0]=first;
            for(int i=1;i<arr.length;i++){
                arr[i]=arr[i-1]^encoded[i-1];
            }
            return arr;
        }
    }
}
