package PrefixSum;

public class PrefixSumPractice {
    public static void main(String[] args) {
        int [] a = {8,3,-2,4,10,-1,0,5};
        int [] prexfixSum = new int[a.length];
        prexfixSum[0] = a[0];
        for(int i=1;i<a.length;i++){
            prexfixSum[i] = prexfixSum[i-1]+a[i];
        }
        //print the prefix sum
        int i=0;
        for(int c : prexfixSum){
            System.out.print("index" + i++ +':' +c + ' ');
        }
        //so when we want to get sum a3->a7 =  ( a3 = a0 + a1 + a2)
        //we can get like this a[l,r] = a(r) - a(l-1) => a[3,7] = a(r) - a(l-1)
        //u can see in the code implement
        System.out.println(prexfixSum[3]);




    }
}
