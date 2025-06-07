package Array;

import java.util.*;

public class AddArrayForm_989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i=num.length-1;
        int carry = 0;
        List<Integer> list = new ArrayList<>();
        while( k != 0 || i>=0){
            int n= k%10;
            int m = i>=0 ? num[i] : 0;
            int sum = m + n + carry;
            carry = sum/10;
            k/=10;
            list.add(0, sum%10);
            i--;
        }
        if (carry != 0) list.add(0, 1);
        return list;
    }
    //Solution 2:Better
    public List<Integer> addToArrayForm2(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            res.add(k % 10);
            k /= 10;
        }

        Collections.reverse(res);
        return res;
    }
}
