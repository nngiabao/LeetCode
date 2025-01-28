package LinkedList;

public class RemoveDupSortedList_83 {
    
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;

        while(cur != null && cur.next != null) {
            if(cur.next.val == cur.val) {
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
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
