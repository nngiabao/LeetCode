public class SingleNumer_136 {
    public static void main(String[] args) {
        int[] t = {4,1,2,1,2};
        System.out.println(singleNumber(t));
    }

    public static int singleNumber(int[] nums) {
        int result=nums[0];
        for (int i = 1; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
