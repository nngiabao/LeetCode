package LinkedList;

public class ConvertSortedListToBST_109 {
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

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    //Solution 1:brute-force
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        //find the midle node by using 2 pointers
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        TreeNode root = new TreeNode(slow.val); // root of the tree we create
        //after we get middle node we will do:
        //build the left sub tree
        ListNode dummy = head;
        TreeNode prev = null;
        //
        while (dummy != slow) {
            TreeNode node = new TreeNode(dummy.val);
            if (prev != null) {
                if(prev.val < node.val){
                    node.left = prev;
                }else node.right = prev;
            }
            //
            prev = node;
            dummy = dummy.next;
        }
        //connect to root
        root.left = prev;
        //build the right sub tree
        slow = slow.next;
        prev = null;
        while (slow != null) {
            TreeNode node = new TreeNode(slow.val);
            if (prev != null) {
                if(prev.val < node.val){
                    node.left = prev;
                }else node.right = prev;
            }
            slow = slow.next;
            prev = node;
        }
        root.right = prev;
        return root;
    }
    //method build tree
}
