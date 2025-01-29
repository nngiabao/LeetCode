package String;

public class LongestCommonPrefix_14 {
    public static void main(String[] args) {
        String[]c = {"flower","flower","flower","flower"};
        System.out.println(longestCommonPrefix(c));
    }

    //navie search
    public static String longestCommonPrefix(String[] strs) {
        int i= 0;
        String prefix = "";boolean stopFlag = false;
        if(strs[0].length()==0) return "";
        while(i<strs[0].length()){
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                System.out.println("i: "+i);
                System.out.println("le: "+strs[j].length());

                if(i==strs[j].length()) return prefix;
                if(ch != strs[j].charAt(i)) return prefix;
            }
            i++;
            prefix += ch;
        }
        return prefix;
    }

    //Solution 2 - best
    //sorted in order by alphabet then compare first and last


}
