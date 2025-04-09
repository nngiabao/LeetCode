package String;

public class RobotReturn2Origin_657 {
    public boolean judgeCircle(String moves) {
        int i=0;
        int[] pos = {0,0};
        while(i<moves.length()) {
            char c = moves.charAt(i);
            if(c=='R') {
                pos[1]++;
            }else if(c=='L'){
                pos[1]--;
            }else if(c=='U'){
                pos[0]++;
            }else if(c=='D'){
                pos[0]--;
            }
            i++;
        }
        return (pos[0] == 0 && pos[1] == 0) ? true : false;
    }
    //best Solution
    public boolean judgeCircle2(String moves) {
        int [] arr = new int [100];
        for(char move :moves.toCharArray()){
            arr[move]++;
        }
        return arr['R']==arr['L'] && arr['U']==arr['D'];
    }
}
