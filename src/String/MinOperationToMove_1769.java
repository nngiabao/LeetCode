package String;

public class MinOperationToMove_1769 {
    public int[] minOperations(String boxes) {
        int len = boxes.length();
        int[] res = new int[len];
        //
        int sum;
        for(int i = 0; i < len; i++){
            sum =0;
            for(int j = 0; j < len; j++){
                if(boxes.charAt(j) == '1'){
                    sum += Math.abs(i - j);
                }
            }
            res[i] = sum;

        }
         //
        return res;
    }
    //Solution 2:Better
    public int[] minOperations2(String boxes) {
        int len=boxes.length();
        int[] output = new int[len];

        int balls=0, moves=0;
        for (int i=0; i<len; i++) {
            if(0<i) {output[i]+=moves+=balls;}
            if(boxes.charAt(i)=='1') {++balls;}
        }
        //
        balls=0; moves=0;
        for(int i=len-1; 0<=i; i--) {
            if(i<len-1) {output[i]+=moves+=balls;}
            if(boxes.charAt(i)=='1') {++balls;}
        }
        return output;
    }
}
