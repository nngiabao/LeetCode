package String;

public class NumberDays_1360 {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(daysSinceEpoch(date1) - daysSinceEpoch(date2));
    }

    private int daysSinceEpoch(String date) {
        String[] split = date.split("-");
        int year = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int day = Integer.parseInt(split[2]);

        // Days in each month
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Total days from year 0000 to the year before this one
        int totalDays = 0;
        for (int y = 0; y < year; y++) {
            totalDays += isLeapYear(y) ? 366 : 365;
        }

        // Add days for the months before this one in current year
        for (int m = 0; m < month - 1; m++) {
            totalDays += months[m];
        }

        // Add one day if it's leap year and month > February
        if (month > 2 && isLeapYear(year)) {
            totalDays += 1;
        }

        // Add the days
        totalDays += day;

        return totalDays;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
