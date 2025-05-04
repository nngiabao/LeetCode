package Array;

import java.util.*;

public class BinaryDivisible5_1018 {
    public static void main(String[] args) {
        int[] nums = {0,1,1,1,1,1};
        BinaryDivisible5_1018 a = new BinaryDivisible5_1018();
        a.prefixesDivBy5(nums);
    }
    //Solution 1:
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
            res.add(check(sb));
        }
        return res;
    }

    public boolean check(StringBuilder bin) {
        int remainder = 0;
        for (int i = 0; i < bin.length(); i++) {
            remainder = (remainder * 2 + (bin.charAt(i) - '0')) % 5;
        }
        return remainder == 0;
    }

    //Solution 2: best
    //When ever shift bit to the right its multi *2
    public List<Boolean> prefixesDivBy5_2(int[] nums) {
        List<Boolean> res = new ArrayList<>();
        int num=0;
        for(int i = 0; i < nums.length; i++){
            num = num*2+ nums[i];
            res.add(num%5 == 0);
        }
        return res;
    }
}
