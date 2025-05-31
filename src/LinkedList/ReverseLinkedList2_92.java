package LinkedList;

import java.util.Stack;

public class ReverseLinkedList2_92 {
    //
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

    public ListNode reverseBetween(ListNode head, int left, int right) {
        //edge cases
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        //ListNode tail = head;
        ListNode prev = dummy;
        //find node left before left indices
        for(int i=0;i<left;i++){
            prev = prev.next;
        }
        //put into stack to reverse
        ListNode temp = prev.next;
        Stack<ListNode> stack = new Stack<ListNode>();
        for(int i=left;i<right;i++){
            stack.push(temp);
            temp = temp.next;
        }
        //then reverse
        while(!stack.isEmpty()){
            prev.next = stack.pop();
            prev = prev.next; // move pointer to the new one
        }
        prev.next = temp;
        //move tail until last node

        return dummy.next;
    }
}
