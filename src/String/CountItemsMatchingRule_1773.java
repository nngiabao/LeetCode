package String;

import java.util.*;

public class CountItemsMatchingRule_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //
        int count = 0;
        int i;
        if (ruleKey.equals("type")) {
            i = 0;
        } else if (ruleKey.equals("color")) {
            i = 1;
        } else {
            i = 2;
        }
        for (List<String> item : items) {
            if (item.get(i).equals(ruleValue)) count++;
        }
        return count;
    }
}
