package Math;

public class CountOperationstoZero_2169 {
    //Soluition 1: normal approach
    public int countOperations(int num1, int num2) {
        int count = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 > num2) num1 -= num2;
            else num2 -= num1;
            count++;
        }
        return count;
    }

    //Solution 2:
    public int countOperations2(int num1, int num2) {
        return 0;
    }
}
