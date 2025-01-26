import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2_119 {
    public static void main(String[] args) {
        System.out.println(getRow(3));
    }

    public static  List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>();
        int temp=1;
        list.add(1);
        if(rowIndex == 0) return list;
        else{
            for(int i = 1; i <= rowIndex; i++) {
                int j=1;
                while(j < i){
                    list.add(j, list.get(j)+ temp);
                    temp = list.get(j+1);
                    list.remove(j+1);
                    j++;
                }
                list.add(1);
            }

        }
        return list;
    }
}
