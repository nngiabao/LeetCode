package String;

public class TruncateSentence_1816 {
    public String truncateSentence(String s, int k) {
        //Solution 1:Using built-in method
        StringBuilder sb = new StringBuilder();
        //
        String[] split = s.split(" ");
        for(int i = 0; i < k; i++){
            sb.append(split[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
    //Solution 2:find whitespace
    public String truncateSentence2(String s, int k) {
        //
        int count=0;
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)==' ') count++;
            if(count==k) break;
            i++;
        }
        return s.substring(0,i);
    }
}
