package Array;

public class DiffSum_2535 {
    public int differenceOfSum(int[] nums) {
        //sum digit
        //sum element
        int sumNums = 0,sumDigit =0;
        for(int i=0;i<nums.length;i++){
            //sum digit
            String num = String.valueOf(nums[i]);
            for(int j=0;j<num.length();j++){
                sumDigit+=num.charAt(j)-'0';
            }
            //sum element
            sumNums += nums[i];
        }
        return Math.abs(sumDigit-sumNums);
    }
    //Solution 2:faster no need to transfer to string
    public int differenceOfSum2(int[] nums) {
        int esum=0,dsum=0;
        for(int num:nums){
            esum+=num;
            int n=num;
            while(n>0){
                dsum+=n%10;
                n/=10;
            }
        }
        return esum>dsum? esum-dsum:dsum-esum;
    }
}
