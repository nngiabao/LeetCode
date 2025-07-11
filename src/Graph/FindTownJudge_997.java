package Graph;

import java.util.Arrays;

public class FindTownJudge_997 {
    //like a grpah
    public int findJudge(int n, int[][] trust) {
        //put into a graph
        //condition
        //1. trust no one
        //2. everyone except him trust him => graph has only 1 point = 0
        //using 2d array to store number of people who trust him
        //we create 2d
        //trust[0] = number people he trust
        //trust[1] = number people who trust him
        int[][] graph = new int[n+1][2];
        //Arrays.fill(graph, 0);
        for(int i = 0; i < trust.length; i++){
            graph[trust[i][0]][0]++; //so nguoi no tin tuong
            graph[trust[i][1]][1]++; // so nguoi dc tin tuong
        }
        //check who trust no one
        for(int i=1; i < graph.length; i++){
            if(graph[i][0] == 0 && graph[i][1] == n-1) return i;
        }
        return -1;
    }
}
