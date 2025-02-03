package Array;

import java.util.*;


public class MinimumIndex_599 {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Shogun","Burger King"};
        //System.out.println(findRestaurant(list1,list2));
        for (String s : findRestaurant(list1, list2)) System.out.println(s);
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<String>();
        //put list 1 in map
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        int min=Integer.MAX_VALUE;
        //check list 2
        for(int i = 0; i < list2.length; i++){
            if(map.containsKey(list2[i])){
                int index = map.get(list2[i]);
                if(index+i < min){
                    result.clear();
                    result.add(list2[i]);
                    min = index+i;
                }else if(index+i == min) result.add(list2[i]);
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
