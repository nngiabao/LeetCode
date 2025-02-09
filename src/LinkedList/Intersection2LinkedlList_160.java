package LinkedList;

public class Intersection2LinkedlList_160 {
    //to find intersec => search from tail to head
    //put into stack
    //stop at node diffrent if not
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;
        ListNode pA = headA;
        ListNode pB = headA;
        ListNode a = headA;
        return null;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
