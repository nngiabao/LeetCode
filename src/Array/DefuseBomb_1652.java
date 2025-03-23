package Array;

import java.util.Arrays;

public class DefuseBomb_1652 {
    public int[] decrypt(int[] code, int k) {
        int [] res = new int [code.length];
        if(k == 0){
            Arrays.fill(code, 0);
        }else{
            //slide window
            //when move:
            // we using modulo to make it circular
            //
            // create new array so we dont change the old
           ;

            for(int i=0; i< code.length; i++){
                int sum=0,n = code.length;
                if(k > 0){
                    for(int j=1; j<= k; j++){
                        sum += code[(i+j)%n];
                    }
                }else{ // k<0
                    for(int j=1; j<= -k; j++){
                        sum += code[(i-j+n)%n];
                    }
                }
                res[i] = sum;
            }
        }
        return res;
    }
}
