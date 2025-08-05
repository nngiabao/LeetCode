package Array;

public class SpecialArray1_3151 {
    public boolean isArraySpecial(int[] nums) {
        //
        for (int i = 1; i < nums.length; i++) {
            int mod_1 = nums[i] & 1;
            int mod_2 = nums[i] & 1;
            if(mod_1 == mod_2) return false;
        }
        return true;
    }
}
