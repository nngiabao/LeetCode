package String;

public class ReverseDegreeString_3498 {
    public int reverseDegree(String s) {
        int product = 0;
        //count product
        for (int i = 0; i < s.length(); i++) {
            product += (26 - s.charAt(i) - 'a') * i;
        }
        return product;
    }
}
