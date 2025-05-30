package LinkedList;

public class DelNodeinLinkedList_237 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    //They give the deleted node
    //so our mission is move the pointer to skip it
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
