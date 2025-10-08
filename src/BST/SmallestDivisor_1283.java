package BST;

public class SmallestDivisor_1283 {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        //find the bigest
        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
        }
        //
        while(left < max){
            int mid = left + (max - left) / 2;

        }
        return 1;
    }

    boolean canDivide(int[] nums, int threshold, int divisor) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor; // ceiling division trick
            if (sum > threshold) return false; // early stop
        }
        return sum <= threshold;
    }
}
