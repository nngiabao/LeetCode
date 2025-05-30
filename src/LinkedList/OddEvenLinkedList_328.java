package LinkedList;

import java.util.List;

public class OddEvenLinkedList_328 {
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

    public ListNode oddEvenList(ListNode head) {
        //edge case
        if(head == null || head.next == null) return head;

        ListNode p_even = head.next;
        ListNode p_odd = head;
        ListNode p_evenhead = p_even;
        //link odd node together
       while(p_evenhead != null && p_even.next != null ) {
           p_odd.next = p_even.next;
           p_odd = p_odd.next;//move the pointer
           p_even.next = p_odd.next;
           p_even = p_even.next;
       }
        //link tail of odd to even
        p_odd.next = p_evenhead;
        return head;
    }
}
