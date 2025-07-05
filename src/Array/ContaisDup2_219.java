package Array;
import java.util.HashMap;
import java.util.HashSet;

import static java.lang.Math.abs;

public class ContaisDup2_219 {
    public static void main(String[] args) {
        int [] a = {1,2,3,1,2,3};
        int k=2;
        System.out.println(containsNearbyDuplicate2(a,k));
    }

    //Solution 1: HashMap
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k){
                return true;
            }

            map.put(nums[i],i);
        }
        return false;
    }

    //HashSet
    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(map.contains(nums[i])){
               return true;
            }
            map.add(nums[i]);
            // this one check if size > k ( => false)
            //cuz if 1 at index 0 but another 1 at index 3 ( doesnt matter cuz
            if(map.size() > k){
                map.remove(nums[i-k]);
            }
        }
        return false;
    }

}
