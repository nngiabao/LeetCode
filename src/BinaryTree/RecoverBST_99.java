package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class RecoverBST_99 {

    public void recoverTree(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if(cur.left != null && cur.left.val > cur.val){
                //swap
                int temp = cur.left.val;
                cur.val = cur.left.val;
                cur.left.val = temp;
            }
        }
    }
    //SOlution 2
    public void recoverTree2(TreeNode root) {
        if(root == null) return;
        if(root.left != null){
            if(root.left.val > root.val){
                int temp = root.left.val;
                root.left.val = root.val;
                root.val = temp;
            }
            recoverTree2(root.left);
        }
        //swap
        if(root.right != null){
            if(root.right.val < root.val){
                int temp = root.left.val;
                root.left.val = root.val;
                root.val = temp;
            }
            recoverTree2(root.right);
        }
    }

    //public
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
}
