package BST;

import java.util.Stack;

public class SearchInBST_700 {
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
  //Solution 1: Using stack
    public TreeNode searchBST(TreeNode root, int val) {
        //
        if (root == null) return null;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        //
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.val==val){
                return node;
            }else{
                if(node.left!=null) stack.push(node.left);
                if(node.right!=null) stack.push(node.right);
            }

        }
        //
        return null;
    }
    //Solution 2:


}
