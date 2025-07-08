package String;

import java.util.*;

public class ZigZagString_6 {
    //Solution 1: Using brute-force
    public String convert(String s, int numRows) {
        int len = s.length();
        //edge case
        if(len < numRows || numRows==1) return s;
        StringBuilder[] rows = new StringBuilder[numRows];// to store eveyr row
        //build every row as StringBuilder for every row
        for(int i=0; i<numRows; i++) {
            rows[i] = new StringBuilder();
        }
        //build every row
        int currentRow = 0;//start from row 0
        int direction = 1;//1 is going up and -1 is going down
        for(char c : s.toCharArray()) {
            rows[currentRow].append(c);//append char to that row
            //check if direct back to first row or last row we need to build
            //so we can reset direction we have to go
            if(currentRow == 0) direction = 1;
            else if(currentRow == numRows-1) direction = -1;

            currentRow += direction;
        }
        //build the string
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : rows){
            res.append(sb.toString());
        }
        return res.toString();
    }
}
