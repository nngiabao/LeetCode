import java.util.HashSet;
import java.util.Set;

public class HappyNum_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = n;
        while (sum != 1) {
            sum = sumDigit(sum);
            if(set.contains(sum)) return false;
            else set.add(sum);
        }
        return true;
    }

    public int sumDigit(int n) {
        int sum = 0;
        while(n>0){
            sum+= Math.pow(n%10,2);
            n/=10;
        }
        return sum;
    }
}
