package LinkedList;

public class InsertGCDLinkedList_2807 {
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

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        //2 pointers 1 to search 1 is for new linked
        if(head == null || head.next == null) return head;
        //pointer to the list
        ListNode current = head;
        while(current != null && current.next != null) {
            //
            ListNode newNode = new ListNode(gcd(current.val, current.next.val));
            //insert
            newNode.next = current.next;
            current.next = newNode;
            //
            current = newNode.next;
        }
        //
        return head;
    }
    //
    int gcd(int a,int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    //
}
