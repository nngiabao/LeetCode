package LinkedList;

public class ConvertBinFromLinkedList_1290 {
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

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int res = 0;
        while(curr != null) {

            res = res * 2 + curr.val;
            curr = curr.next;
        }
        return res;
    }
}
