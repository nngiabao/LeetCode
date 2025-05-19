package Array;

public class MinTimeTypeWord_1974 {
    public int minTimeToType(String word) {
        //count time first letter type
        int sum=0;
        char target=word.charAt(0);
        int counterwiseclock = ('a'-target+26)%26 ;
        int wiseclock = (target-'a'+26)%26;
        sum+=Math.min(counterwiseclock,wiseclock)+1;
        if(word.length()==1) return sum;
        //every time type +1s

        //so we have to find shorter path between counterwiseclock and wiseclock
        for(int i = 1; i < word.length(); i++) {
            char current = word.charAt(i-1);
            target = word.charAt(i);
            wiseclock = (target-current+26)%26;
            counterwiseclock = (current-target+26)%26 ;
            sum+= Math.min(counterwiseclock,wiseclock)+1;
        }
        return sum;
    }
}
