package String;

public class MaxDiffEvenOddFrequence1_3442 {
    public int maxDifference(String s) {
        int[] dictionary = new int[26];
        //put into dictionary
        for (char c : s.toCharArray()) {
            dictionary[c - 'a']++;
        }
        //we select odd to be min
        //even to be max
        int odd = Integer.MIN_VALUE, even = Integer.MAX_VALUE;
        for (int i = 0; i < dictionary.length; i++) {
            if(dictionary[i] == 0) continue;
            if(dictionary[i] % 2 == 0){
                even = Math.min(even, dictionary[i]);
            }else{
                odd = Math.max(odd, dictionary[i]);
            }
        }
        return odd-even;
    }
}
