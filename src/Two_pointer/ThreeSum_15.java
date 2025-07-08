package Two_pointer;

import java.util.*;

public class ThreeSum_15 {
    public static void main(String[] args) {
        ThreeSum_15 a = new ThreeSum_15();
        int[] t = {-1, 0, 1, 2, -1, -4};
        System.out.println(a.threeSum(t));

    }

    //Solution 1: Brute-force - fails some testcases
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> triplet = new ArrayList<>();
        HashSet<List<Integer>> res = new HashSet<>();
        //Using 3 loops
        int len = nums.length;
        for (int i = 0; i < len-2; i++) {
            for (int j = i + 1; j < len-1; j++) {
                for (int k = j+1; k < len; k++) {
                    if (nums[i]+nums[j]+nums[k] == 0) {
                        triplet = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(triplet);//get unique array
                        res.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(res);
    }

    //Solution 2:Using 2 pointers and sorting bad version
    public List<List<Integer>> threeSum2(int[] nums){
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        //
        for(int i = 0; i < nums.length-2; i++){
            int left = i + 1;
            int right = nums.length - 1;
            int target = -nums[i];
            while(left < right){
                if(nums[left] + nums[right] == target) res.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                if(nums[left] + nums[right] < target) left++;
                else right--;
            }
        }
        return new ArrayList<>(res) ;
    }
    //Solution 3: like solution 2 but better and clean code
    public List<List<Integer>> threeSum3(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)return res;
            if(i>0&&nums[i]==nums[i-1])continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum<0){
                    left++;
                }else if(sum>0){
                    right--;
                }else{
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right&&nums[left]==nums[left+1])left++;
                    while(left<right&&nums[right]==nums[right-1])right--;
                    left++;
                    right--;
                }
            }
        }
        return res;
    }
}
