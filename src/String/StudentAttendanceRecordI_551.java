package String;

public class StudentAttendanceRecordI_551 {
    public boolean checkRecord(String s) {
        if(s.length() == 1) return true;
        int flagAbsence = 0,flagLate = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'P') flagLate=0;
            else if(ch == 'A'){
                flagAbsence++;
                flagLate=0;
            }else flagLate++;
            //not eligible
            if(flagAbsence == 2 || flagLate == 3) return false;
        }
        return true;
    }
}
