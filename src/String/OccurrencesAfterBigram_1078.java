package String;

import java.util.*;

public class OccurrencesAfterBigram_1078 {
    public String[] findOcurrences(String text, String first, String second) {
        String[] temp = text.split(" ");
        boolean isFirst = false;
        boolean isSecond = false;
        int count = 0;
        List<String> result = new ArrayList<>();
        for(int i=0;i<temp.length-2;i++) {
            if(temp[i].equals(first) && temp[i+1].equals(second)) result.add(temp[i+2]);
        }

        return result.toArray(new String[result.size()]);
    }
}
