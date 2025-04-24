package Math;

import java.util.Arrays;

public class FindGCDArray_1979 {
    public int findGCD(int[] nums) {
        //sorted array to find greatest and lowest value
        Arrays.sort(nums);
        return gcd(nums[0], nums[nums.length-1]);
    }

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b,a%b);
    }
}
