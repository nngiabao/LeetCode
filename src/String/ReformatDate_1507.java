package String;

import java.util.HashMap;

public class ReformatDate_1507 {
    public String reformatDate(String date) {
        String [] split = date.split(" ");
        HashMap<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
        //get day
        StringBuilder sb = new StringBuilder();
        for(char ch : split[0].toCharArray()) {
            if(Character.isDigit(ch)) sb.append(ch);
            else break;
        }

        String day = (sb.length() < 2) ? "0"+sb.toString() : sb.toString();
        //get month
        //get year

        return split[2]+"-"+ map.get(split[1])+"-"+day;
    }
}
