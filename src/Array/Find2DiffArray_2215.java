package Array;

import java.util.*;
import java.util.stream.Collectors;

public class Find2DiffArray_2215 {
    public static void main(String[] args) {
        int[] n1 = {1,2,3,3};
        int[] n2 = {1,1,2,2};
        System.out.println(findDifference2(n1,n2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //using 2 pointer
        //because this is 0-indexed
        //we can use 2 pointers
        //if nums[i] < nums[j] => i++;
        //or vice versa;
        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                i++;
                j++;
                continue;
            }
            if(nums1[i]<nums2[j]){
                list1.add(nums1[i]);
                i++;
                continue;
            }
            if(nums1[i]>nums2[j]){
                list2.add(nums2[j]);
                j++;
                continue;
            }
        }
        //check remain nums1 and nums2
        if(i<nums1.length){
            while(i<nums1.length){
                list1.add(nums1[i]);
                i++;
            }
        }
        if(j<nums2.length){
            while(j<nums2.length){
                list2.add(nums2[j]);
                j++;
            }
        }
        //return res
        res.add(list1);
        res.add(list2);
        return res;
    }
    //retainAll
    public static List<List<Integer>> findDifference2(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        //put into set 1
        for(int i=0;i<nums1.length;i++){
            set1.add(nums1[i]);
        }

        // put into set 2
        for(int i=0;i<nums2.length;i++){
            set2.add(nums2[i]);
        }
        //find a intersection b
        //put set 1 into set temp
        Set<Integer> temp = new HashSet<>(set1);
        //add list 1
        //remove before add
        set1.removeAll(set2);
        res.add(new ArrayList<>(set1));
        //add list 2
        set2.removeAll(temp);
        res.add(new ArrayList<>(set2));
        return res;
    }

    //Solution 2 - best
    public List<List<Integer>> findDifference3(int[] nums1, int[] nums2) {
        return new java.util.AbstractList<List<Integer>>() {
            List<Integer> list1;
            List<Integer> list2;

            @Override
            public int size() {
                return 2;
            }

            @Override
            public List<Integer> get(int index) {
                if (list1 == null || list2 == null) {
                    process();
                }
                return index == 0 ? list1 : list2;
            }

            private void process() {
                HashSet<Integer> s1 = Arrays.stream(nums1)
                        .boxed()
                        .collect(Collectors.toCollection(HashSet::new));
                HashSet<Integer> s2 = Arrays.stream(nums2)
                        .boxed()
                        .collect(Collectors.toCollection(HashSet::new));
                list1 = new ArrayList<>();
                list2 = new ArrayList<>();

                for (var i : s1) {
                    if (!s2.contains(i)) {
                        list1.add(i);
                    }
                }
                for (var i : s2) {
                    if (!s1.contains(i)) {
                        list2.add(i);
                    }
                }
            }
        };
    }
    }
