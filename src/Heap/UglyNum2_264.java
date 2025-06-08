package Heap;

public class UglyNum2_264 {
    public static void main(String[] args) {
        UglyNum2_264 a = new UglyNum2_264();
        a.nthUglyNumber(10);

    }
    //Solution 1: Only for small test cases
    public int nthUglyNumber(int n) {
        if(n<= 6) return n;
        //int i=
        n -= 6;
        for(int i=8;i<Integer.MAX_VALUE;i++){
            //check ugly num
            int temp = i;
            while(temp % 5 == 0) temp /= 5;
            while(temp % 3 == 0) temp /= 3;
            while(temp % 2 == 0) temp /= 2;
            if(temp == 1) n--;
            if(n==0) return i;
        }
        return 0;
    }
    //Solution 2:Using pq with dp
}
