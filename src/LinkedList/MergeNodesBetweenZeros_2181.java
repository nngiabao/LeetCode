package LinkedList;

import java.util.LinkedList;

public class MergeNodesBetweenZeros_2181 {
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

    public ListNode mergeNodes(ListNode head) {
        //pointer to point the linked list
        if (head == null || head.next == null) return null;
        //
        ListNode current = head.next; // first node always 0
        //
        ListNode newList = new ListNode(-1);
        ListNode dummy = newList;
        //
        int sum = 0;
        while(current != null) {
            //
            if(current.val == 0){
                ListNode newNode = new ListNode(sum);
                //link it
                newList.next = newNode;
                newList = newList.next;
                sum = 0;
            }else{
                sum += current.val;
            }
            //move to next node
            current = current.next;
        }
        return dummy.next;
    }
}
