package BinaryTree;
import java.util.*;
public class BinTreeRightSideView_119 {
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

    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return null;
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            int size = queue.size();
            TreeNode prev = null; // pointer
            int i=0;
            while(i < size) {
                TreeNode node = queue.poll();
                prev = node;
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                i++;
            }
            list.add(prev.val);
        }
        return list;
    }
}
