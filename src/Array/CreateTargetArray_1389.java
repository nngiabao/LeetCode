package Array;

import java.util.ArrayList;

public class CreateTargetArray_1389 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        if (nums[0] == 0) System.out.println("cc");
    }

    //this same as hash table simulation
    public int[] createTargetArray(int[] nums, int[] index) {
        //create hash table array
        if (nums.length == 1) return nums;
//
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            //for(int j = 0; j < index.length; j++) {}
            int index_i = index[i];
            if(res[index_i] == 0 )  res[index_i] = nums[i];
            else{
                //while()
            }
        }
        return null;
    }

    //Solution 2: Using dynamic array => arraylist
    public int[] createTargetArray2(int[] nums, int[] index) {
        if (nums.length == 1) return nums;
        //
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index_i = index[i];
            list.add(index_i,nums[i]);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}
