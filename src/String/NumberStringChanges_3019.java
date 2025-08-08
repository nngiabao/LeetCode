package String;

public class NumberStringChanges_3019 {
    public int countKeyChanges(String s) {
        //
        int count = 0;
        //
        char[] chars = s.toLowerCase().toCharArray();
        for(int i = 1; i < chars.length; i++){
            if(chars[i] != chars[i-1]) count++;
        }
        //
        return count;
    }
}
