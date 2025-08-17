package Greedy;

public class OptimalPartiotionString_2405 {
    //Solution 1:
    public int partitionString(String s) {
        int n = s.length();
        if(n == 1) return 1;
        /// /
        StringBuilder sb = new StringBuilder();
        ///
        int count = 0;
        for(char c : s.toCharArray()) {
            //check if exisit
            //=> increase count and
            if(sb.indexOf(String.valueOf(c)) > -1){
                count++;
                sb = new StringBuilder();
            }
            sb.append(c);
        }
        return sb.length() != 0 ? ++count : count;
    }
}
