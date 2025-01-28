package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Inordertraversal_94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        inOrder(root,res);
        return res;
    }

    public static void inOrder(TreeNode node,List<Integer> res){
        if(node == null) return;
        inOrder(node.left,res);
        res.add(node.val);
        inOrder(node.right,res);
    }
    //public

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
}
