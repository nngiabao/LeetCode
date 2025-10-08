package BST;
import java.util.*;
//

public class SearchSuggestions_1268 {
    //SOlution 1:Trie + BST
    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> ans = new ArrayList<>();
        String prefix = "";

        for (char c : searchWord.toCharArray()) {
            prefix += c;
            int start = lowerBound(products, prefix);
            List<String> suggest = new ArrayList<>();

            for (int i = start; i < Math.min(start + 3, products.length); i++) {
                if (products[i].startsWith(prefix))
                    suggest.add(products[i]);
                else break;
            }

            ans.add(suggest);
        }
        return ans;
    }

    static int lowerBound(String[] products, String prefix) {
        int left = 0, right = products.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (products[mid].compareTo(prefix) < 0)
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
