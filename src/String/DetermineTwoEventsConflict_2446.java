package String;

public class DetermineTwoEventsConflict_2446 {
    public boolean haveConflict(String[] event1, String[] event2) {
        //start and end time of event 1
        String[] start_e1 = event1[0].split(":");
        String[] end_e1 = event1[1].split(":");
        String[] start_e2 = event2[0].split(":");
        String[] end_e2 = event2[1].split(":");
        //convert into int
        int start_e1_i = Integer.parseInt(start_e1[0]) * 60 + Integer.parseInt(start_e1[1]);
        int end_e1_i = Integer.parseInt(end_e1[0]) * 60 + Integer.parseInt(end_e1[1]);
        int start_e2_i = Integer.parseInt(start_e2[0]) * 60 + Integer.parseInt(start_e2[1]);
        int end_e2_i = Integer.parseInt(end_e2[0]) * 60 + Integer.parseInt(end_e2[1]);
        //
        if (start_e1_i > end_e2_i || start_e2_i > end_e1_i) return true;
        return false;
    }
}
