package Greedy;

import java.util.Arrays;

public class DividePlayersIntoTeam_2491 {
    public static void main(String[] args) {
        DividePlayersIntoTeam_2491 a =  new DividePlayersIntoTeam_2491();
        int[] c = {3, 4};
        a.dividePlayers(c);
    }
    public long dividePlayers(int[] skill) {
        //edge case
        Arrays.sort(skill);
        int n = skill.length;
        int totalSkill = skill[0]+skill[n-1];
        if(skill.length==2) return skill[0]*skill[n-1];
        int i=1,j = n - 2;
        //
        long sum = skill[0]*skill[n-1];
        //
        while (i < j){
            if((skill[i] + skill[j] != totalSkill)) return -1;
            sum +=  skill[i] * skill[j];
            i++;
            j--;
        }
        return sum;
    }
}
