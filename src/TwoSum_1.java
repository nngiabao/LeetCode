import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int input[] ={2,7,11,15},target=9;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<input.length;i++){
            map.put(i,input[i]);
        }
        for (int i : map.keySet()){
            if(map.containsValue(target-map.get(i))){
                System.out.println(map.get(i));
            }
        }

    }
}

