package Math;
import java.util.*;
public class SelfDividingNumbers_728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i=left; i<=right; i++){
            if(checkDigit(i)) list.add(i);
        }
        return list;
    }

    //check digit
    public boolean checkDigit(int num) {
        if(num<10) return true;
        int temp=num;
        while(num != 0){
            int digit = num%10;
            if( digit == 0 || temp%digit !=0) return false;
            num /=10;
        }
        return true;
    }
}
