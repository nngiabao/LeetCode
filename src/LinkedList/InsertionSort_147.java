package LinkedList;

import java.util.*;

public class InsertionSort_147 {
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

    //Solution 1:Brute-force
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = head;
        ListNode newHead = new ListNode(0);
        //
        List<Integer> list = new ArrayList<Integer>();
        while (dummy != null) {
            list.add(dummy.val);
            dummy = dummy.next;
        }
        //sort
        Collections.sort(list);
        //build new one
        ListNode newdummy = newHead;
        for (int i : list) {
            newdummy.next = new ListNode(i);
            newdummy = newdummy.next;
        }
        //
        return newHead.next;
    }

    //SOlution 2:Inertion sort
    public ListNode insertionSortList2(ListNode head) {
        //using 2 pointers to simulate insertion sort
        ListNode dummy = new ListNode(0);
        ListNode current = head;
        //
        while (current != null) {
            //move the pointer until find spot to insert
            ListNode prev = dummy;
            //
            while(prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            //swap
            //before swap need to store the node
            ListNode next = current.next;
            current.next = prev.next;
            prev.next = current;
            //move current
            current = next;
        }
        return dummy;
    }

}
