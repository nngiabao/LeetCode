package String;

import java.util.Arrays;

public class CountPrefixSuffix_3042 {
    public int countPrefixSuffixPairs(String[] words) {
        //Using brute-force
        int count = 0;
        int n = words.length;
        //Arrays.sort(words);
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(words[j].startsWith(words[i]) && words[i].endsWith(words[j])) count++;
            }
        }
        //
        return count;
    }
}
