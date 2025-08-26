package Sorting;

import java.util.*;
import java.util.PriorityQueue;

public class GroupsSpecialStrings_893 {
    public static void main(String[] args) {
        GroupsSpecialStrings_893 a = new GroupsSpecialStrings_893();
        String[] s = {"abcd", "cdab", "cbad", "xyzz", "zzxy", "zzyx"};
        a.numSpecialEquivGroups2(s);
    }

    //Solution 1:
    public int numSpecialEquivGroups(String[] words) {
        //
        int n = words.length;
        //we have to create something so we won duplicate
        //create pq for ood and even
        int count = 0;
        boolean[] visited = new boolean[n];
        List<String> checked = new ArrayList<String>();
        //
        for (int i = 0; i < n; i++) {
            //if(words[i].equals("")) continue;
            if (visited[i]) continue;
            visited[i] = true;
            count++;
            //
            PriorityQueue<Character> prev_pq_odd = new PriorityQueue<>();
            PriorityQueue<Character> prev_pq_even = new PriorityQueue<>();
            for (int j = i + 1; j < n; j++) {
                //skip if it count already
                if (visited[j]) continue;
                PriorityQueue<Character> pq_odd = new PriorityQueue<>();
                PriorityQueue<Character> pq_even = new PriorityQueue<>();
                //
                for (int k = 0; k < words[j].length(); k++) {
                    if ((k & 1) == 0) {
                        pq_even.add(words[j].charAt(k));
                        prev_pq_even.add(words[i].charAt(k));
                    } else {
                        prev_pq_odd.add(words[i].charAt(k));
                        pq_odd.add(words[j].charAt(k));
                    }
                }
                //compare if the same
                //cannot be compare here
                boolean flag = true;
                while (!pq_odd.isEmpty()) {
                    if (pq_odd.poll() != prev_pq_odd.poll()) {
                        flag = false;
                        break;
                    }
                }
                while (flag && !pq_even.isEmpty()) {
                    if (pq_even.poll() != prev_pq_even.poll()) {
                        flag = false;
                        break;
                    }
                }
                if (flag) visited[i] = true;
            }
        }
        return count;
    }

    //Solution 2:
    public int numSpecialEquivGroups2(String[] words) {
        //to count how many
        HashSet<String> set = new HashSet<>();
        int n = words[0].length();
        //
        for(String word : words) {
            char[] c_odd = new char[n/2];
            char[] c_even = new char[n/2+1];
            //
            int odd_index = 0, even_index = 0;
            for(int i=0;i<n;i++){
                if((i&1)==1) c_odd[odd_index++]=word.charAt(i);
                else c_even[even_index++]=word.charAt(i);
            }
            //sort
            Arrays.sort(c_odd);
            Arrays.sort(c_even);
            //
            set.add(new String(Arrays.toString(c_odd)+Arrays.toString(c_even)));
            //
        }
        return set.size();
    }
}
