package Greedy;

import java.util.Arrays;

public class SmallestString_1663 {
    public static void main(String[] args) {
        SmallestString_1663 a = new SmallestString_1663();
        System.out.println(a.getSmallestString(1,2));
    }
    //Solution 1:Greedy - slow
    public String getSmallestString(int n, int k) {
        char [] chars = new char[n];
        Arrays.fill(chars, 'a');
        int remaining = k-n;
        //Greedy is here we will take the min char between remaining and min char
        for(int i=n-1;i>=0;i--){
            int gap = Math.min(remaining,25);
            chars[i] += (char) gap;
            remaining -= gap;
        }
        //build
        StringBuilder res = new StringBuilder();
        for(char ch : chars){
            res.append(ch);
        }
        return res.toString();
    }
    //Solution 2:Handle in place no need to use extra loop
    public String getSmallestString2(int n, int k) {
        char[] arr = new char[n];
        Arrays.fill(arr, 'a');
        int index = n - 1;
        k -= n;
        while(k > 0) {
            if(k >= 26) {
                arr[index] = 'z';
                k -= 25;
            } else {
                arr[index] = (char) ('a' + k);
                k = 0;
            }
            index--;
        }

        return new String(arr);

    }
}
