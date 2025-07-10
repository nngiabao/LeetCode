package String;

import java.util.*;

public class ConvertDateToBin_3280 {
    //Solution 1:using built-in method
    String convertDateToBinary(String date) {
        //
        String[] split = date.split("-");
        //
        return Integer.toBinaryString(Integer.parseInt(split[0]))
                +"-"+Integer.toBinaryString(Integer.parseInt(split[1]))
                +"-"+Integer.toBinaryString(Integer.parseInt(split[2]));
    }
    //Solution 2:
    String convertDateToBinary2(String date) {
        //
        String[] split = date.split("-");

         //
        return convertBin(split[0])+"-"+convertBin(split[1])+"-"+convertBin(split[2]);
    }
    //bin method
    String convertBin(String date) {
        int num = Integer.parseInt(date);
        StringBuilder sb = new StringBuilder();
        while(num>0){
            sb.append(num%2);
            num/=2;
        }
        return sb.reverse().toString();
    }
    //Solution 3:Best
    public String convertDateToBinary3(String date) {
        String y = date.substring(0,4);
        String m = date.substring(5,7);
        String d = date.substring(8,10);
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toBinaryString(Integer.parseInt(y)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(m)));
        sb.append("-");
        sb.append(Integer.toBinaryString(Integer.parseInt(d)));
        return sb.toString();
    }
}
