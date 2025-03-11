package Greedy;

public class LemonadeChange_860 {
    public boolean lemonadeChange(int[] bills) {
        //we need to track on 5$ and 10$
        //for greeedy algorithm we always pick the highest first
        //i.e 20$ we have to use 10$ + 5$ first
        //if not enough we check 3x5$
        int five=0,ten=0;
        for(int i = 0; i < bills.length; i++) {
            if(bills[i]==5) {
                five++;
            }else if(bills[i]==10) {
                if(five == 0) return false;
                five--;
                ten++;
            }else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }else if(five>=3){
                    five-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
