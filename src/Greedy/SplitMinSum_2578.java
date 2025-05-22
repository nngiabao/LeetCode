package Greedy;

import java.util.Arrays;

public class SplitMinSum_2578 {
    //Solution 1:Using greedy method
    public int splitNum(int num) {
        //Using greedy to build 2 numbers
        char[] char_num = String.valueOf(num).toCharArray();
        Arrays.sort(char_num);
        //build 2 numbers
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();
        for(int i=0;i<char_num.length;i+=2){
            num1.append(char_num[i]);
            if(i != char_num.length-1) num2.append(char_num[i+1]);
        }
        return Integer.parseInt(num1.toString())+ Integer.parseInt(num2.toString());
    }
}
