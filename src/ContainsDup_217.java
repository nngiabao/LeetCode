import java.util.HashSet;

public class ContainsDup_217 {
    public static void main(String[] args) {

    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }

    //Solution 2
    // Insertion sort

}
