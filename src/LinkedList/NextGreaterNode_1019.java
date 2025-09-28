package LinkedList;

import java.util.*;

public class NextGreaterNode_1019 {
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
    //Solution 1: Monotic stack
    public int[] nextLargerNodes(ListNode head) {
        //convert into Array
        List<Integer> list = new ArrayList<>();
        //

        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int[] res = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < list.size(); i++) {
            //if()
        }
        return res;
    }
}
