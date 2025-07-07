package Bit;

public class BinaryGap_868 {
    public int binaryGap(int n) {
        int max = 0;
        StringBuilder sb = new  StringBuilder();
        while(n != 0) {
            sb.append(n%2);
            n = n / 2;
        }
        int start = -1;
         //check
        for(int i=0;i<sb.length();i++) {
            if(sb.charAt(i) == '1') {
                if(start != -1)
                    max = Math.max(max, i - start);
                start = i;
            }
        }
        return max;
    }
}
