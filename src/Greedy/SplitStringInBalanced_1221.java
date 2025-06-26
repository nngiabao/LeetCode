package Greedy;

public class SplitStringInBalanced_1221 {
    //when encounter 'L' inc temp by 1 otherwise dec 1
    public int balancedStringSplit(String s) {
        int count=0,i=0,temp=0;
        while(i<s.length()){
            if(s.charAt(i) == 'L') temp++;
            else temp--;
            if(temp == 0) count++;
            i++;
        }
        return count;
    }
}
