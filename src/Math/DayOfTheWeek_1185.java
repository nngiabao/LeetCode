package Math;

import java.time.*;

public class DayOfTheWeek_1185 {
    //Solution 1:
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dow = date.getDayOfWeek(); // e.g. MONDAY
        String result = dow.toString().charAt(0) + dow.toString().substring(1).toLowerCase();
        return result;
    }

    //Solution 2:Using formula
    public String dayOfTheWeek2(int day, int month, int year) {
        int[] monthcode = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        String[] ans = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int yy = year % 100;
        int yearcode = (yy + yy / 4) % 7;
        int century = year / 100;
        int centurycode;
        if (century % 4 == 0) centurycode = 6;
        else if (century % 4 == 1) centurycode = 4;
        else if (century % 4 == 2) centurycode = 2;
        else centurycode = 0;
        int code = monthcode[month - 1];
        if ((month == 1 || month == 2) && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            code -= 1;
        }
        int res = (day + code + yearcode + centurycode) % 7;
        return ans[res];
    }
}
