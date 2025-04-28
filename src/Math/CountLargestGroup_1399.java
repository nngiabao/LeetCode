package Math;

import java.util.*;

public class CountLargestGroup_1399 {
    public static void main(String[] args) {
        CountLargestGroup_1399 a = new CountLargestGroup_1399();
        a.countLargestGroup(13);
    }
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //PriorityQueue<Integer> sizeList = new PriorityQueue<>((a,b) -> b - a);
        List<Integer> list = new ArrayList<>();
        //TreeMap to automatic arrange size
        for(int i=1;i<=n;i++){
            int sum = sumDigit(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        //
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(map.get(entry.getKey()));
        }
        //sort list
        Collections.sort(list,Collections.reverseOrder());
        //count
        int count=1;
        int max = list.get(0);
        for(int i=1;i<list.size();i++){
            if(max != list.get(i))break;
            else count++;
        }

        return count;
    }

    //return sum of digit
    public int sumDigit(int n) {
        int sum=0;
        while(n !=0 ){
            sum+= n%10;
            n /= 10;
        }
        return sum;
    }
}
