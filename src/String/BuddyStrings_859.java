package String;

import java.util.ArrayList;

public class BuddyStrings_859 {
    //Solution 1:
    public boolean buddyStrings(String s, String goal) {
        if(s.length() != goal.length()) return false;
        int [] temp = new int[26];
        //check duplicate sting => false
        if(s.equals(goal)){
            for(int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 'a';
                temp[index]++;
                if(temp[index] > 1) return true;
            }
            return false;
        }
        ArrayList<Integer> diff = new ArrayList<>();
        //if s != goal we have to find diff indices
        int i=0;
        while(i < s.length()) {
            if(s.charAt(i) != goal.charAt(i)){
                diff.add(i);
            }
            i++;
        }
        //check 1 time swap => diff size has to be equal to 2
        return diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1)) && s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
    }
}
