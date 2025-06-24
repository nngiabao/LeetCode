package String;

public class CheckEquivalantStrings_1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        String s2 = "";
        for(String s : word1){
            s1+= s;
        }
        //
        for(String s : word2){
            s2+=s;
        }
        return s1.equals(s2);
    }
    //Solution 2: Using string builder
    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder w1=new StringBuilder();
        StringBuilder w2=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            w1.append(word1[i]);
        }
        for(int i=0;i<word2.length;i++){
            w2.append(word2[i]);
        }
        if(w1.toString().equals(w2.toString())){
            return true;
        }
        return false;
    }
}
