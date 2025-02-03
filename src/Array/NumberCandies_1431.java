package Array;
import java.util.*;

public class NumberCandies_1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int [] temp = candies.clone();
        Arrays.sort(temp);
        int max = temp[candies.length - 1];
        for(int i = 0; i < candies.length; i++) {
            result.add(candies[i]+extraCandies >= max  ? true : false);
        }
        return result;
    }

    /*
    fastest solution
    public List<Boolean> kidsWithCandies(int[] c, int e) {
        int n=c.length;
        int max=c[0];
        for(int i=0;i<n;i++){
            if(c[i]>max){
                max=c[i];
            }

        }
        List<Boolean> r=new ArrayList <>();
        for(int i=0;i<n;i++){
            if(c[i]+e>=max){
                r.add(true);
            }
            else{
                r.add(false);
            }

        }
        return r;
    }
     */
}
