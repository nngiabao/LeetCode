package String;

public class LongerContiguousSegments_1869 {
    public static void main(String[] args) {
        LongerContiguousSegments_1869 a= new LongerContiguousSegments_1869();
    a.checkZeroOnes("111000");
    }
    public boolean checkZeroOnes(String s) {
        //
        int maxOne=0,maxZero=0;
        int start=0;
        int len = s.length();
        //
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char c_start = s.charAt(start);
            //
            if(c_start != c){
                int segment_length = i - start;
                if(c_start == '0') maxZero=Math.max(segment_length,maxZero);
                else maxOne=Math.max(segment_length,maxOne);
                start=i;
            }
        }
        //last handle
        int segment_length = len - start;
        if(s.charAt(start) == '0') maxZero=Math.max(segment_length,maxZero);
        else maxOne=Math.max(segment_length,maxOne);
        //
        return maxOne > maxZero;
    }
}
