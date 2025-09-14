package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SumOfNodes_1315 {
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

    //using custom class
    class CustomNode {
        TreeNode grandparent;
        TreeNode parent;
        TreeNode current;

        public CustomNode(TreeNode grandparent, TreeNode parent, TreeNode current) {
            this.grandparent = grandparent;
            this.parent = parent;
            this.current = current;
        }
    }

    //
    public int sumEvenGrandparent(TreeNode root) {
        //
        int sum = 0;
        //
        Queue<CustomNode> queue = new LinkedList<>();
        queue.add(new CustomNode(null, null, root));
        //TreeNode parent = null;
        //TreeNode grandParent = null;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                CustomNode node = queue.poll();
                TreeNode current = node.current;
                TreeNode grandparent = node.grandparent;
                TreeNode parent = node.parent;
                if (grandparent != null && (grandparent.val & 1) == 0) sum += current.val;
                //
                if (current.right != null) queue.add(new CustomNode(parent, current, current.right));
                if (current.left != null) queue.add(new CustomNode(parent, current, current.left));
                //

            }
        }
        return sum;
    }
    //Solution 2:Recursion
}
