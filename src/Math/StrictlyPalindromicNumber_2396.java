package Math;

public class StrictlyPalindromicNumber_2396 {
    public boolean isStrictlyPalindromic(int n) {
        int base = n-2;
        while(base>=2){
            String bin = returnBin(n,base);
            int i=0,j=bin.length()-1;
            while(i<j){
                if(bin.charAt(i)!=bin.charAt(j)){
                    return false;
                }
                i++;
                j--;
            }
            base --;
        }
        return true;
    }

    public String returnBin(int n,int base) {
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n%base);
            n /=base;
        }
        return sb.reverse().toString();
    }
}
