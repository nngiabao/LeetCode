package String;

public class CheckWordEquals_1880 {
    //
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        //put the first into dictionary
        StringBuilder first = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            first.append(firstWord.charAt(i) - 'a');
        }
        //put the second into dictionary
        StringBuilder second = new StringBuilder();
        for (int i = 0; i < secondWord.length(); i++) {
            second.append(secondWord.charAt(i) - 'a');
        }
        //build target digit
        StringBuilder target = new StringBuilder();
        for (int i = 0; i < targetWord.length(); i++) {
            target.append(targetWord.charAt(i) - 'a');
        }
        //
        int sum = Integer.parseInt(first.toString())+ Integer.parseInt(second.toString());
        int sum_tartget = Integer.parseInt(target.toString());
        return (sum == sum_tartget) ? true : false;
    }
}
