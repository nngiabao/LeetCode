package LinkedList;

import java.util.*;
//
public class LinkedListComponents_817 {
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

    public int numComponents(ListNode head, int[] nums) {
        ListNode cur = head;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);
        //
        while (cur != null) {
            //every time linkedlist not connect => count
            if(list.contains(cur.val) &&(cur.next == null || !list.contains(cur.next.val))) count++;
            cur = cur.next;
        }
        return count;
    }
}
