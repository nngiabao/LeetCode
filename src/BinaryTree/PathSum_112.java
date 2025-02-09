package BinaryTree;

import java.util.Stack;

public class PathSum_112 {
    public static void main(String[] args) {

    }

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


   //using stack, store a pair include node and value
    // so when we have value of sum at that node == target => true
    //if not => no
    static class Pair{
        int remainingSum;
        TreeNode node;
        public Pair(int remainingSum, TreeNode node) {
            this.remainingSum = remainingSum;
            this.node = node;
        }
   }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if(root.left == null && root.right == null) return root.val == targetSum;
        Stack<Pair> stack = new Stack<>();
        int sum = 0;
        stack.push(new Pair(targetSum - root.val, root));
        while (!stack.isEmpty()) {
            Pair p = stack.pop();
            //check is it leaf or not and value = 0 or not ? => return true
            if(p.node.right == null && p.node.left == null && p.node.val == 0)  return true;
            //if have left,right
            if(p.node.left != null) stack.push(new Pair(p.remainingSum-p.node.left.val, p.node.left));
            if(p.node.right != null) stack.push(new Pair(p.remainingSum-p.node.right.val, p.node.right));
        }
        return false;
    }

    //Solution 2: Recursion
}
