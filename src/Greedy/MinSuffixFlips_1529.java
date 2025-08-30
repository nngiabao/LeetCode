package Greedy;

public class MinSuffixFlips_1529 {
    public int minFlips(String target) {
        int ops = 0;
        char curent = '0';
        //
        for(int i = 0; i < target.length(); i++) {
            if(target.charAt(i) != curent) {//it means current is different
                ops++;
                curent = target.charAt(i);
            }
        }
        //
        return ops;
    }
}
