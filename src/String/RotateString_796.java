package String;

public class RotateString_796 {
    //Solution 1:
    public boolean rotateString(String s, String goal) {
        int i=0;
        while(i < s.length()) {
            StringBuilder sb = new StringBuilder();
            //slice to the back
            sb.append(s.substring(i, s.length())).append(s.substring(0, i));
            if(sb.toString().equals(goal)) return true;
            i++;
        }
        return false;
    }
    //Solution 2: O(n) => best
    public boolean rotateString2(String s, String goal) {
        if(s.length() != goal.length()) return false;
        if((s+s).contains(goal)) return true;
        return false;
    }
}
