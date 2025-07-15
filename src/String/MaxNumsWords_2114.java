package String;

public class MaxNumsWords_2114 {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            int count = 1;
            for (int j = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') count++;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
