package Math;

public class CountSymmetricIntegers_2843 {
    //Solution 1:Worse case
    public int countSymmetricIntegers(int low, int high) {
        if(high < 11) return 0;
        int count = 0;
        while(low <= high) {
            if(checkSymmetric(low)) count++;
            low++;
        }
        return count;
    }

    public boolean checkSymmetric(int num) {
        String str = String.valueOf(num);
        if((str.length()&1) ==1) return false;
        int i=0,j=str.length()-1;
        int sumleft=0,sumright = 0;
        while(i < j) {
            sumleft+= str.charAt(i)-'0';
            sumright+= str.charAt(j)-'0';
        }
        return (sumleft == sumright) ? true : false;
    }
}
