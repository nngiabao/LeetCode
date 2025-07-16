package Math;

public class SubstractProductSum_1281 {
    public int subtractProductAndSum(int n) {
        //find product
        int sum = 0,product = 1;
        String num = String.valueOf(n);
        for(int i = num.length()-1;i>=0;i--){
            int digit = num.charAt(i) - '0';
            sum+= digit;
            product *= digit;
        }
        //find sum
        return product-sum;
    }
}
