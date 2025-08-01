package Array;

public class ProductOfArray_238 {
    public static void main(String[] args) {
        //System.out.println(productExceptSelf(new int[]{1, 2, 3, 4}));
        for(int i : productExceptSelf(new int[]{1, 2, 3, 4})) System.out.println(i);
    }

    //Solution 1
    //the idea of this problem is count prefix then multiply to suffix
    //=> O(n)
    public static int[] productExceptSelf(int[] nums) {
        //create array
        int[] result = new int[nums.length];
        //count prefix
        int prefix=1;
        for(int i=1; i<nums.length; i++){
            result[i] = prefix;
            prefix *=nums[i];
        }
        //count suffix by go from right to left because if go
        //from left to right we have to keep loop counting
        int suffix=1;
        for(int i=nums.length-2; i>=0; i--){
            result[i] *= suffix;
            suffix *=nums[i];
        }
        return result;
    }

    static {
        for (int i = 0; i < 500; i++) {
            productExceptSelf(new int[]{0, 0});
        }
    }

    //Best solution 2
    public static int[] productExceptSelf2(int[] nums) {
        int[] output = new int[nums.length];
        output[nums.length - 1] = 1;
        int mult = nums[0];

        for (int index = nums.length - 2; index >= 0; index--) {
            output[index] = nums[index + 1] * output[index + 1];
        }

        for (int index = 1; index < nums.length; index++) {
            output[index] = mult * output[index];
            mult = mult * nums[index];
        }

        return output;
    }
}
