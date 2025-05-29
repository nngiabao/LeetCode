package LinkedList;

public class RemNthNode_19 {
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

    public ListNode removeNthFromEnd(ListNode head, int n) {
        //using 2 pointers
        ListNode dummy = new ListNode(0) ;// create to check the edge case
        dummy.next = head;
        //
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }
        //move 2 pointers at the same time
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;
    }
}
