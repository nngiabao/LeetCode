package Greedy;

public class KItemsMaxSum_2600 {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        if(k==0) return 0;
        int sum = 0;
        while(k >0){
            //pick num 1 first
            while(numOnes>0 ){
                if(k == 0) return sum;
                sum += 1;
                numOnes--;
                k--;
            }
            //pick num 1 first
            while(numZeros>0 ){
                if(k == 0) return sum;
                numZeros--;
                k--;
            }
            //pick num -1
            while(numNegOnes>0 ){
                if(k == 0) return sum;
                sum += -1;
                numNegOnes--;
                k--;
            }
        }
        return sum;
    }
}
