package String;

public class MinNumberOfStepsAnagram2_2186 {
    public int minSteps(String s, String t) {
        //
        int[] s_dict = new int[26];
        int[] t_dict = new int[26];
        //
        int count = 0;
        for (char c : s.toCharArray()) s_dict[c - 'a']++;
        for (char c : t.toCharArray()) t_dict[c - 'a']++;
        //
        for (int i = 0; i < 26; i++) {
            count += Math.abs(s_dict[i] - t_dict[i]);
        }
        ///
        return count;
    }
    //Solution 2: Better only 1 array
    public int minSteps2(String s, String t) {
        int[] letters = new int[26];
        int n = s.length(), m = t.length();
        for (int i = 0; i < n; i++) {
            letters[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < m; i++) {
            letters[t.charAt(i) - 'a']--;
        }
        int ans = 0;
        for (int freq : letters) {
            ans += Math.abs(freq);
        }
        return ans;
    }
}
