public class FindDifference_389 {
    public static void main(String[] args) {
        String s = "";
        String t = "y";
        System.out.println(findTheDifference(s,t));
    }

    public static char findTheDifference(String s, String t) {
        int sumS=0, sumT=0;
        for(int i = 0; i < s.length(); i++){
            sumS+=s.charAt(i);
            sumT+=t.charAt(i);
        }
        return  (char) ((sumT + t.charAt(t.length() - 1)) - sumS);
    }

    //best way
    static{
        for(int i = 0; i<500; i++){
            findTheDifference(new String(), new String());
        }
    }
    public static char findTheDifference2(String s, String t, int k) {
            int[] arr = new int[26];
            for(char c : s.toCharArray()) arr[c - 'a']++;
            for(char c : t.toCharArray()) arr[c - 'a']--;
            for(int i = 0; i<26; i++) if(arr[i] == -1) return (char) ('a' + i);
            return 'a';
        }
}

