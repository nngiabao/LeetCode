package String;

public class FindLeastFreqDigit_3663 {
    public int getLeastFrequentDigit(int n) {
        //
        int[] freq = new int[10];
        while(n>0){
            freq[n%10]++;
            n/=10;
        }
        //find min
        int min = -1;
        for(int i=0; i<10; i++){
            if(freq[i] != 0){
                if(min == -1) min = i;
                else if(freq[i] < freq[min]) min = i;
            }
        }
        return min;
    }
}
