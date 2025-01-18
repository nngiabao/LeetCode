import java.util.ArrayList;

public class MinimumIndex_599 {
    public static void main(String[] args) {
        String [] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String [] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        //System.out.println(findRestaurant(list1,list2));
        for(String s : findRestaurant(list1,list2)) System.out.println(s);
    }

    public static String[] findRestaurant(String[] list1, String[] list2) {
        Integer minIndex = null,size=1;
        String[] result = new String[size];
        //ArrayList<String> result = new ArrayList<String>();
        for(int i = 0; i < list1.length; i++){
            for(int j = 0; j < list2.length; j++){
                if(list1[i].equals(list2[j])){
                    if(minIndex != null){
                        if(minIndex > i+j){
                            minIndex = i+j;
                            result[0] = list1[i];
                        }else if(minIndex == i+j){
                            result = new String[++size];
                            for(int k = 0; k < size; k++){
                                result[k] = list1[minIndex-k];
                            }
                        }
                    }else{
                        minIndex = i+j;
                        result[0] = list1[i];
                    }
                }
            }
        }
        return result;
    }
}
