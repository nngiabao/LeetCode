package PracticeQuestionForContest;

public class GenerateTag {
    public String generateTag(String caption) {
        //split
        String[] words = caption.split(" ");
        StringBuilder sb = new StringBuilder();
        sb.append("#");
        sb.append(words[0].toLowerCase());
        for(int i=1;i<words.length;i++){
            //uppercase first letter
            sb.append(words[i].substring(0,1).toUpperCase());
            //then append the rest of the string
            int len = words[i].length();
            sb.append(words[i].substring(1,len));
        }
        return sb.toString();
    }
}
