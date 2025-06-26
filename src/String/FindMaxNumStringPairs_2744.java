package String;

public class FindMaxNumStringPairs_2744 {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                StringBuilder temp = new StringBuilder(words[j]);
                if(words[i].equals(temp.reverse().toString())) count++;
            }
        }
        return count;
    }
    //Solution 2:Just compare 2 first chars because every character is distinct
    public int maximumNumberOfStringPairs2(String[] words) {
        int count = 0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if((words[i].charAt(0) == words[j].charAt(1))
                && (words[i].charAt(1) == words[j].charAt(0))) count++;
            }
        }
        return count;
    }
}
