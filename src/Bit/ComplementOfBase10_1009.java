package Bit;

public class ComplementOfBase10_1009 {
    public int bitwiseComplement(int n) {
        //
        if(n==0) return 1;
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.append((n % 2)^1);
            n /= 2;
        }
        //
        sb.reverse();
        int i =0;
        int res =0;
        while(i<sb.length()){
            res = res*2+(sb.charAt(i)-'0');
            i++;
        }

        return res;
    }
}
