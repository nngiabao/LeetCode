package Array;

public class FindEvenDigitNumber_1295 {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(check(nums[i])) count++;
        }
        return count;
    }

    boolean check(int n){
        int count=0;
        while(n!=0){
            n /= 10;
            count++;
        }
        return (count & 1) == 0 ? true : false;
    }
}
