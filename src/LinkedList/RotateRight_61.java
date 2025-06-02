package LinkedList;

public class RotateRight_61 {
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

    //with this problem we have to find

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        //
        ListNode oldTail = head;
        //find length
        int length = 0;
        while(oldTail.next != null) {
            oldTail = oldTail.next;
            length++;
        }
        //make circular
        oldTail.next = head;
        //find new tail and new head
        //new tail = (length-k % length-1)th
        //new head = (length - k % length )th
        k = k % length;
        //find new tail
        ListNode newTail = oldTail.next;
        for(int i=0;i<length-k-1;i++){
            newTail = newTail.next;
        }
        //
        ListNode newHead = newTail.next;
        //return new tail to null to break circular
        newTail.next = null;
        return newHead;
    }
}
