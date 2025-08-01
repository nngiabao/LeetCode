package String;

public class NumberStrings_1967 {
    public int numOfStrings(String[] patterns, String word) {
        //using contains method
        int count = 0;
        for(String p : patterns){
            if(word.contains(p)) count++;
        }
        ///
        return count;
    }
}
