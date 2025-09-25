package Array;

public class CheckDistances_2399 {

    public boolean checkDistances(String s, int[] distance) {
        //build dict
        int[] dict = new int[26];
        //
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (dict[c] == 0) {
                // store first appearance (add +1 so default 0 works as "not visited")
                dict[c] = i + 1;
            } else {
                int firstIndex = dict[c] - 1;
                if (i - firstIndex - 1 != distance[c]) return false;
            }
        }
        return true;
    }
}
