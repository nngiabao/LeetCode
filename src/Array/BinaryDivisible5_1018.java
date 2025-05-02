package Array;

import java.util.*;

public class BinaryDivisible5_1018 {
    public List<Boolean> prefixesDivBy5(int[] nums) {

        return null;
    }

    //
    public boolean check(String s){
        if (s.length() == 1) return false;
        StringBuilder bin = new StringBuilder(s).reverse();
        int i=0;
        if(bin.charAt(i) == '1') return false;
        //if(bin.charAt(index) == '0')
        int sum=0;
        while(i < bin.length()){

        }
        return (sum == 1) ? true : false;
    }
}
