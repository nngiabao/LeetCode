package PrefixSum;

public class MinValPosStep_1413 {
    public int minStartValue(int[] nums) {
        int startVal = 1;
        boolean flag = false;
        while(!flag) {
            int total = startVal;
            flag = true; // assume so when it satisfied it will return
            for(int i=0;i<nums.length;i++) {
                if(total+nums[i] < 1){
                    startVal++;
                    flag = false; //because there is exist a number not satisfied
                    break;
                }
            }
        }
        return startVal;
    }
}
