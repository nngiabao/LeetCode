package String;

public class IncDecString_1370 {
    public String sortString(String s) {
        StringBuilder result = new StringBuilder();
        if(s.length() == 1) return s;
        //dictionary
        int[] dict = new int[26];
        //
        for(char c : s.toCharArray()){
            dict[c - 'a']++;
        }
        int total = s.length();
        while(total > 0){
            //go forward
            for(int i=0;i<26;i++){
                if(dict[i] > 0){
                    result.append((char)(i+'a'));
                    dict[i]--;
                    total--;
                }

            }
            //go backward
            for(int i=25;i>=0;i--){
                if(dict[i] > 0){
                    result.append((char)(i+'a'));
                    dict[i]--;
                    total--;
                }
            }
        }
        return result.toString();
    }
}