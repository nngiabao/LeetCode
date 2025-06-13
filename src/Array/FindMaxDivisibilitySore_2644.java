package Array;

public class FindMaxDivisibilitySore_2644 {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=0,divisibility=0;
        for(int divisor : divisors){
            int count=0;
            for(int num : nums){
                if(num%divisor==0) count++;
            }
            if(max < count){
                max = count;
                divisibility = divisor;
            }else if(max == count){
                divisibility = Math.min(divisibility, divisor);
            }
        }
        return divisibility;
    }
}
