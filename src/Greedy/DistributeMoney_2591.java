package Greedy;

public class DistributeMoney_2591 {
    public static void main(String[] args) {
        DistributeMoney_2591 obj = new DistributeMoney_2591();
        System.out.println(obj.distMoney(20,3));

    }
    public int distMoney(int money, int children) {
        //edge case: every children get atleast 1 dollar
        if(money < children) return -1;
        //
        int count=0;
        int prev=money-children;
        boolean check = false;
        if(prev-7>=0) {
           while(prev>0  && children>0) {
               if(prev == 3){
                   count--;
                   return count;
               }else{
                   children--;
                   prev -= 7;
                   count++;
               }
           }
        }
        return count;
    }
}
