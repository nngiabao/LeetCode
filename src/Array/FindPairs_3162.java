package Array;

public class FindPairs_3162 {
    //Solution 1:brute-force
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;
        for(int num1 : nums1){
            for (int num2 : nums2){
                if (num1 % (num2*k) == 0) count++;
            }
        }
        return count;
    }
}
