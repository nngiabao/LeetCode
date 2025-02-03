package LinkedList;

import java.util.Stack;

public class ReverseLinkList_206 {

    //using stack
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode cur = head;
        Stack<ListNode> stack = new Stack<>();
        //push into stack
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        //create new reverse list
        ListNode result = stack.pop();
        //pointer
        ListNode prev = result;
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            prev.next = node;// link to next node
            prev = node;
        }

        prev.next = null;//end list or it will be cycle linkedlist
        return result;
    }

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
}
