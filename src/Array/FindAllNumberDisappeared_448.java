package Array;
import java.util.*;

public class FindAllNumberDisappeared_448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        //put into set
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        //find missing
        for(int i=1;i<=nums.length;i++){
            if(set.contains(i)) continue;
            else result.add(i);
        }
        return result;
    }
}
