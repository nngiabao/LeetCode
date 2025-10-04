package Math;

public class CountOddNumbers_1523 {
    public int countOdds(int low, int high) {
        if((low &1)==0) low++;
        //
        int count=0;
        for(int i=low;i<=high;i+=2){
            count++;
        }
        return count;
    }
    //Solution 2:Math
    public int countOdds2(int low, int high) {
        int evens = (high + 1) / 2;
        int odds = low / 2;
        return evens - odds;
    }
}
