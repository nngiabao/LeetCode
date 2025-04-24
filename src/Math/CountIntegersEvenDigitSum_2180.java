package Math;

public class CountIntegersEvenDigitSum_2180 {
    public static void main(String[] args) {
        CountIntegersEvenDigitSum_2180 a = new CountIntegersEvenDigitSum_2180();
        a.countEven(4);
    }
    //Solution 1: normal approach
    public int countEven(int num) {
        if(num==1) return 0;
        //if(num==2) return 1;
        int count=0;
        for (int i = 2; i <= num; i++) {
            if(checkEven(i)) count++;
        }
        return count;
    }

    public boolean checkEven(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return ((sum & 1) == 0) ? true : false;
    }
}
