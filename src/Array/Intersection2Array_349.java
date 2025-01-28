package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Intersection2Array_349
{
    public static void main(String[] args) {


    }

    //Solution 1
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<>();
        //push nums1 into hashtable
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            map.putIfAbsent(nums1[i], 1);
        }
        //browse array 2 to find
        for (int i = 0; i < nums2.length; i++) {
            if(map.containsKey(nums2[i])) {
                result.add(nums2[i]) ;
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    //Solution 2 - using retainAll( this method fidn intersection)
    public int[] intersection2(int[] nums1, int[] nums2){
        //push ele into set 1
        Set<Integer> set1 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }
        //push ele into set 2
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set2.add(nums2[i]);
        }
        //using built-in method retainAll
        set1.retainAll(set2);
        //using stream java 8 to convert
        return set1.stream().mapToInt(Integer::intValue).toArray();//built-in method
    }
}
