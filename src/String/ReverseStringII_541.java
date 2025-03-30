package String;

public class ReverseStringII_541 {
    //Solution 1: Built-in function
    public String reverseStr(String s, int k) {
        int i=0;
        StringBuilder res =new StringBuilder();
        while(i< s.length()){
            //append revers k words
            //we have to check end1 of this with s.length
            int end1 = Math.min(i+k,s.length());
            res.append(new StringBuilder(s.substring(i,end1)).reverse());
            //append the res
            //we have to check end2 of this with s.length
            int end2 = Math.min(i+2*k,s.length());
            if(end1 < end2) res.append(s,end1,end2);
            //step to next 2k block
            i+=2*k;
        }
        return res.toString();
    }

    //Solution 2:Using in-place swap
    public String reverseStr2(String s, int k) {
        char[] chars = s.toCharArray();
        for(int i=0; i<= s.length(); i+=k){
            //
            int start = i,end = Math.min(s.length(),i+k);
            reverse(chars,start,end);
        }

        return chars.toString();
    }

    //build reverse method
    public void reverse(char[] s,int start,int end){
        while(start < end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
    }
}
