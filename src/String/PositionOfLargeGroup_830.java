package String;
import java.util.*;

public class PositionOfLargeGroup_830 {
    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(largeGroupPositions(s));
    }
    //Solution 1 - basic
    //
    public static List<List<Integer>> largeGroupPositions(String s) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int start=0;
        for (int i = 1; i <= s.length(); i++) {
            //here we have condition i=s.length so when
            //it reachs length it will not run into second condition => error
            //
            if(i==s.length() ||  s.charAt(i)!=s.charAt(start)){
                if(i-start>=3){
                    result.add(Arrays.asList(start,i-1));
                }
                start = i;
            }
        }
        return result;
    }

    //Solution 2: 2 pointers
    public static List<List<Integer>> largeGroupPositions2(String s) {
        //using 2 pointers
        int i=0,j=1;
        List<List<Integer>> result = new ArrayList<>();
        while(i<s.length()&&j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                if((j-i) >= 3) result.add(Arrays.asList(j,i));
                i++;
                j++;
            }else{
                j++;
            }
        }
        return null;
    }
}
