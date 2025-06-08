package LinkedList;

public class SwapNodesInPair_24 {
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

    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        while (prev.next != null && prev.next.next != null) {
            //swap
            ListNode temp = new ListNode(0);
            temp.val = prev.next.val;
            prev.next.val = temp.next.next.val;
            prev.next.next.val = temp.val;
            //moves this pointer to 2 nodes after
            prev = prev.next.next;
        }
        return dummy.next;
    }
}
