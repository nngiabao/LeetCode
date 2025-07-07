package String;

import java.util.ArrayList;
import java.util.HashSet;

public class BullsAndCows_299 {
    //Solution 1: worst
    public String getHint(String secret, String guess) {
        //we have to find the bull
        //x=bull
        //y=cow
        //build the cage for cows
        int[] cage = new int[10];
        ArrayList<Integer> pos = new ArrayList<Integer>();//store pos of bulls
        int x=0,y=0;
        //find bull
        for(int i=0;i<secret.length();i++){
            char c_secret = secret.charAt(i);
            char c_guess = guess.charAt(i);
            if(c_secret==c_guess){
                x++;
                pos.add(i);
            }else{
                cage[c_secret-'0']++;
            }
        }
        //find cows in guess
        for(int i=0;i<guess.length();i++){
            int cow = guess.charAt(i)-'0';
            if(!pos.contains(i) &&  cage[cow]>0){
                y++;
                cage[cow]--;
            }
        }
        return x+"A"+y+"B";
    }
    //Solution 2:Better
    //x=bulls,y=cows
    public String getHint2(String secret, String guess) {
        //store cows
        int[] guess_cage = new int[10];
        int[] serect_cage = new int[10];
        int x=0,y=0;
        for(int i=0;i<secret.length();i++){
            char c_secret = secret.charAt(i);
            char c_guess = guess.charAt(i);
            if(c_secret==c_guess) x++;
            else {
                guess_cage[c_secret-'0']++;
                serect_cage[c_guess-'0']++;
            }
        }
        //find cows
        for(int i=0;i<10;i++){
            y+= Math.min(guess_cage[i],serect_cage[i]);
        }
        return x+"A"+y+"B";
    }
}

