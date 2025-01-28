package LinkedList;

public class RemoveDupSortedList2_82 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        ListNode result = new ListNode(0);
        ListNode prev = result; // pointer 2 for new linked list
        boolean flag = false;//flag to check duplicate - true = dup
        while (cur != null) {
            while(cur.next != null && cur.val == cur.next.val) {
                cur = cur.next;
                flag = true;
            }
            if(!flag){
                prev.next = cur;
                prev = prev.next;
            }
            cur = cur.next;
            flag = false;
        }
        return result.next;
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
