package BinaryTree;

import java.util.*;
public class BinTreeZigzagLevelOrderTraversal_103 {
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> level = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int h = 0; //check height
        while(!queue.isEmpty()) {
            int size = queue.size();
            int i=0;
            level = new ArrayList<>();
            while(i < size){
                TreeNode node = queue.poll();
                if((h & 1) == 1) level.addFirst(node.val);
                else level.add(node.val);
                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
                i++;
            }
            result.add(level);
            h++;
        }
        return result;
    }
}
