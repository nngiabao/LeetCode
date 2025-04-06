package Array;

import java.util.*;

public class DegreeOfArray_697 {
    public static void main(String[] args) {
        //1,2,2,3,1,4,2
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
    }
    /*
    This question is find first and last index of most repeated number
    so we will have their sub array
     */

    //using 2 pointers
    public static int findShortestSubArray(int[] nums) {
        int [] temp = nums.clone();
        //int [] highestFreq = new int[nums.length];
        List<Integer> highestFreq = new ArrayList<Integer>();
        Arrays.sort(temp);
        int count=1,number=nums[0],max=0,start=0;
        //find most freq num
        for(int i=1;i<temp.length;i++){
            if(temp[i] != temp[i-1]){
                //count=1;
                //check maxMath.max(i-1-start,max);
                //max =
                //if(max )
                start=i;
            }else Math.max(i-1-start,max);

        }

        //2 pointers to checck first and last
        int left=0,right=nums.length-1;
        for(int i=0;i<nums.length; i++) {
            if(nums[left] != number) left++;
            if(nums[right] != number) right--;
            if(nums[right] == number && nums[left] == number) break;
        }

        return right-left+1;
    }

    //Solution 2: Hashmap
    public int findShortestSubArray2(int[] nums){
        //put into hashmap
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            max=Math.max(max,map.get(nums[i]));
        }
        //check the freq
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();


        }
        //int num = map.containsValue()
        //find the leghtn
        int i=0,j=nums.length-1;
        while(i<j){
            //if()
            i++;
            j--;
        }
        return 0;
    }
}
