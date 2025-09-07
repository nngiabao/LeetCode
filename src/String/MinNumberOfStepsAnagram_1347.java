package String;

public class MinNumberOfStepsAnagram_1347 {
    public int minSteps(String s, String t) {
        //
        int n = s.length();
        int[] s_dict = new int[26];
        int[] t_dict = new int[26];
        int count = 0;
        //put s and t in a dict
        for(char c : s.toCharArray())
            s_dict[c - 'a']++;
        for(char c : t.toCharArray())
            t_dict[c - 'a']++;
        //
        for(int i = 0; i < 26; i++){
            if(s_dict[i] !=0 &&  s_dict[i] > t_dict[i]){
                count+= s_dict[i] - t_dict[i];
            }
        }
        return count;
    }
}
