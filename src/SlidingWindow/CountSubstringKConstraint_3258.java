package SlidingWindow;

public class CountSubstringKConstraint_3258 {
    //Solution 1:Best - using sliding window
    public int countKConstraintSubstrings(String s, int k) {
        //
        int bit_1 = 0 , bit_0 = 0, left = 0, count=0;
        //

        for(int right = 0; right <s.length(); right++){
            char c_right = s.charAt(right);
            if(c_right=='1') bit_1++;
            else bit_0++;
            //you have to shrink left
            while(bit_1 > k && bit_0 > k){
                char c_left = s.charAt(left);
                if(c_left == '1') bit_1--;
                else bit_0--;
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    //Solution 2:Using 2 loops - brute-force
    public int countKConstraintSubstrings2(String s, int k) {
        int count=0;
        int n = s.length();
        for(int i =0;i<n-1;i++){
            int bit_1 = 0 , bit_0 = 0;
            for(int j =i;j<n;j++){
                char c = s.charAt(j);
                if(c=='1') bit_1++;
                else bit_0++;
                //check
                if (bit_0 <= k || bit_1 <= k) {
                    count++;
                } else {
                    break;
                }
                if(bit_0 > k && bit_1 > k) break;
            }
        }
        return count;
    }
}
