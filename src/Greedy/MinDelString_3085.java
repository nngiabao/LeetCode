package Greedy;

public class MinDelString_3085 {
    public int minimumDeletions(String word, int k) {
        //
        if(word.length() < 2) return 0;
        //count freq
        //count [t,t+k]
        int[] dictionary = new int[26];
        int maxFreq=0,minFreq=0;
        for(char c : word.toCharArray()){
            int index = c-'a';
            dictionary[index]++;
            if(dictionary[index] > maxFreq) maxFreq = dictionary[index];
            if(dictionary[index] < minFreq) minFreq = dictionary[index];
        }
        //
        int min=Integer.MAX_VALUE;
        for(int i=1; i<maxFreq; i++){
            int count=0;
            for(int j=0; j<26; j++){
                int maxTarget = i+k;
                if(dictionary[j] < i) count+=dictionary[j];
                else if(dictionary[j] > maxTarget) count+=dictionary[j]-maxTarget;
            }
            min = Math.min(count,min);
        }
        return min;
    }
}
