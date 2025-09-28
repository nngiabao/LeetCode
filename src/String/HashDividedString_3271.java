package String;

public class HashDividedString_3271 {
    public String stringHash(String s, int k) {
        int len = s.length();
        int[] res = new int[len / k + len % k];
        //Build the result
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += s.charAt(i) - 'a';
            if ((i+1) % k == 0) {
                res[index++] = sum;
                sum = 0;
            }
        }
        //build
        for (int i = 0; i < res.length; i++) {
            sb.append((char)(res[i] % 26 + 'a'));
        }
        return sb.toString();
    }
}
