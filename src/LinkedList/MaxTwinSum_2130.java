package LinkedList;

import java.util.*;

public class MaxTwinSum_2130 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    //Solution 1:2 pointers with list
    public int pairSum(ListNode head) {
        //put it in a array
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        //find max sum
        int i=0,j=list.size()-1;
        int max = 1;
        while(i<j){
            max = Math.max(max,list.get(i)+list.get(j));
            i++;
            j--;
        }
        return max;
    }
    //Solution 2:
    public int pairSum2(ListNode head) {
        return 1;
    }
}
