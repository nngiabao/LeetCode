package Array;

public class PermutationDiff_3146 {
    public int findPermutationDifference(String s, String t) {
        //
        int[] cage = new int[26];
        //
        for(int i = 0; i < t.length(); i++){
            cage[t.charAt(i) - 'a'] = i;
        }
        int sum=0;
        //build permutation
        for(int i = 0; i < s.length(); i++){
            sum += Math.abs(i-cage[s.charAt(i) - 'a']);
        }
        return sum;
    }
}
