package String;

public class NumbersOfLines_808 {
    public static void main(String[] args) {
        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String s = "abcdefghijklmnopqrstuvwxyz";

        for(int i : numberOfLines(widths,s)){
            System.out.println(i);
        }
    }

    public static int[] numberOfLines(int[] widths, String s) {
        //check every count we pass
        int lines = 1,tracker = 0,i=0;
        while(i < s.length()) {
            char c = s.charAt(i);
            int len = widths[c-'a'];
            if((tracker +len) > 100){
                tracker = 0;
                lines++;
            }
            tracker+= len;
            i++;
        }
        return new int[]{lines,tracker};
    }
}
