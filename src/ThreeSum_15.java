import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {


    }

    //Solution 1
    //Using hashmap
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Set<List<Integer>> uniqueTriplets = new HashSet<>();
        List<Integer> triplet;
        HashMap<Integer, Integer> map = new HashMap<>();
        int target,complement;
        for(int i = 0; i < nums.length; i++) {
            target = -nums[i];
            for(int j = i+1; j < nums.length; j++) {
                complement = target - nums[j];
                if(map.containsKey(complement)) {
                    triplet = Arrays.asList(map.get(complement), nums[i],nums[j]);
                    //triplet.sort();
                    uniqueTriplets.add(triplet);
                }
                //put in map if it not have
                map.put(nums[j],j);
            }
        }
        //convert into
        res.addAll(uniqueTriplets);;
        return res;
    }
}
