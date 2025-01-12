import java.util.ArrayList;
import java.util.Collections;

public class PlusOne_66 {
    public static void main(String[] args) {
        int[] a = {9,8,7,6,5,4,3,2,1,0};
        plusOne(a);

    }

    //Solution 1 - worst
    public static int[] plusOne(int[] digits) {
        int i=digits.length-1,temp=1;
        ArrayList<Integer> result = new ArrayList<>();
        while (i>=0){
            if(temp != 0){
                if(digits[i]+1==10) {
                    result.add(0);
                }else{
                    result.add(++digits[i]);
                    temp--;
                }
            }else{
                result.add(digits[i]);
            }
            i--;
        }
        if (temp==1) result.add(1);
        Collections.reverse(result);
        for(Integer c : result) System.out.println(c);
        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
    //
    public static int[] plusOne2(int[] digits) {
        int spot = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i - 1 == -1) {
                    int[] output = new int[digits.length + 1];
                    output[0] = 1;
                    for (int j : digits) {
                        output[spot++] = 0;
                    }
                    return output;
                }
                continue;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        return digits;
    }
}
