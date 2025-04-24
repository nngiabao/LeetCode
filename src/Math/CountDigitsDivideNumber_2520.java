package Math;

public class CountDigitsDivideNumber_2520 {
    public int countDigits(int num) {
        if(num < 10) return 1;
        int count=0,temp=num;
        while(num != 0){
            if(temp%(num% 10) == 0) count++;
            num/=10;
        }
        return count;
    }
}
