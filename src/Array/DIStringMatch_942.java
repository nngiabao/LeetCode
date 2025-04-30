package Array;

public class DIStringMatch_942 {
    public int[] diStringMatch(String s) {
        int[] res = new int[s.length()];
        int n = s.length();
        int low =0,high = n;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'I'){
                res[i] = low;
                low++;
            }else{
                res[i] = high;
                high--;
            }
        }
        res[n-1] = low;
        return res;
    }
}
