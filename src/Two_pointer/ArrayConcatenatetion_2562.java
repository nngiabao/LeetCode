package Two_pointer;

public class ArrayConcatenatetion_2562 {
    //Solution 1:Using 2 pointers
    public long findTheArrayConcVal(int[] nums) {
        int i = 0, j = nums.length - 1;
        //
        long sum = 0;
        while (i < j) {
            int temp = 0;
            String concat = String.valueOf(nums[i]) + String.valueOf(nums[j]);
            for (int k = 0; k < concat.length(); k++) {
                temp = concat.charAt(k) - '0' + temp * 10;
            }
            sum += temp;
            i++;
            j--;
        }
        return ((nums.length & 1) == 0) ? sum : sum + nums[i];
    }

    //SOlution 2: optimize ver
    public long findTheArrayConcVal2(int[] nums) {
        long concatenation = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            concatenation = concatenation + (nums[i] * (int) Math.pow(10, String.valueOf(nums[j]).length()) + nums[j]);
            i++;
            j--;
        }
        if (nums.length % 2 != 0) {
            concatenation += nums[nums.length / 2];
        }
        return concatenation;
    }
}
