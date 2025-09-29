package String;

public class RemoveAllOccurances_1910 {
    public String removeOccurrences(String s, String part) {
        //there exist part in s
        StringBuilder res = new StringBuilder(s);
        int index = res.indexOf(part);
        int len = part.length();
        while(index != -1) {
           res.delete(index, index + len);
           index = res.indexOf(part);

        }
        return res.toString();
    }
}
