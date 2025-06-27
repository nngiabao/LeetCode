package String;

public class CountConsitentStrings_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        //build dictionary
        int[] dic = new int[26];
        //
        for(char c : allowed.toCharArray()){
            dic[c-'a']++;
        }
        //
        int count=0;
        boolean flag = true;
        for(String word : words){
            flag =true;
            for(int i=0;i<word.length();i++){
                if(dic[word.charAt(i)-'a'] == 0){
                    flag = false;
                    break;
                }
            }
            if(flag) count++;
        }
        return count;
    }
}
