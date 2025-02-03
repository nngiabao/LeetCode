package Math;

import java.util.ArrayList;

public class HappyNumber_202 {

    //using tortoise and hera algorithm to dectect cycle
    public boolean isHappy(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int sum=0;
        while(sum!=1 || !checkCycle(list)){
            sum=0;
            while(n!=0){
                sum+= Math.pow(n%10,2);
                n /=10;
            }
            list.add(sum);
        }
        return false;
    }

    static boolean checkCycle(ArrayList<Integer> arr) {
        if (arr.size()==0 || arr.size()==1) return false;
        //int
        //while
        return true;
    }

}
