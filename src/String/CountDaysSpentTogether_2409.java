package String;

public class CountDaysSpentTogether_2409 {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        //find start and end of Alice
        String [] start_a = arriveAlice.split("-");
        int startDate_a = Integer.parseInt(start_a[1]);;
        int startMonth_a = Integer.parseInt(start_a[0]);
        String [] end_a = leaveAlice.split("-");
        int endDate_a = Integer.parseInt(end_a[1]);;
        int endMonth_a = Integer.parseInt(end_a[0]);
        //find start and end of Bob
        String [] start_b = arriveBob.split("-");
        int startDate_b = Integer.parseInt(start_a[1]);;
        int startMonth_b = Integer.parseInt(start_a[0]);
        String [] end_b = leaveBob.split("-");
        int endDate_b = Integer.parseInt(end_a[1]);;
        int endMonth_b = Integer.parseInt(end_a[0]);
        //calender
        int [] calender = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //if start month not in alice period => return
        int overlapDay = 0;
        //
        if(startMonth_a < startMonth_b  && endMonth_a > startMonth_b){
            for(int i=startMonth_b;i<endMonth_a;i++){
                overlapDay += calender[i];
                startMonth_b++;
            }
        }
        //same month
        if(endMonth_a == startMonth_b ){
            //if bob arrive first

            overlapDay+= endDate_a - startDate_b;
            //if bob arrive after that

        }
        return overlapDay;
    }
}
