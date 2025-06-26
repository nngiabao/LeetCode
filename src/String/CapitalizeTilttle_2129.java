package String;

public class CapitalizeTilttle_2129 {
    public String capitalizeTitle(String title) {
        String[] temp = title.split(" ");
        StringBuilder result = new StringBuilder();
        //
        for(String word : temp){
            if(word.length() < 3){
                word.toLowerCase();
            }else{
                word = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
            }
            result.append(word).append(" ");
        }
        //
        return result.toString().trim();
    }
}
