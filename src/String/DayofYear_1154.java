package String;

public class DayofYear_1154 {
    public int dayOfYear(String date) {
        int [] calendar = {31,28,31,30,31,30,31,31,30,31,30,31};
        String[] dates = date.split("-");
        int count= Integer.parseInt(dates[2]);
        int month = Integer.parseInt(dates[1]);
        //count leap year
        int year = Integer.parseInt(dates[0]);
        if((year % 400 == 0 ) || (year % 100 != 0 && year % 4==0) && month > 2 ) count++;
        for(int i=1;i<month;i++){
            count+= calendar[i-1];
        }
        return count;
    }
}
