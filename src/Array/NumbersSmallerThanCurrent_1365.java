package Array;

public class NumbersSmallerThanCurrent_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //put into array
        //bcause constraint is small => we can use this
        int[] arr = new int[101];
        //put into dictionary
        for(int num : nums){
            arr[num]++;
        }
        //
        for(int i = 0; i < arr.length; i++){
            int count=0;
            for(int j=0; j<nums[i]; j++){
                count+= arr[j];
            }
            nums[i] = count;
        }
        return nums;
    }
}
