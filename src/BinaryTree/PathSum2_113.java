package BinaryTree;

import java.util.*;

public class PathSum2_113 {
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

    //Solution 1:Using custom pair
    class Pair{
        int val;
        TreeNode node;
        List<Integer> path;
        public Pair(int val, TreeNode node,List<Integer> path) {
            this.val = val;
            this.node = node;
            this.path = path;
        }
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        //
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        if(root == null) return res;
        //initial
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root.val, root, new ArrayList<>(Arrays.asList(root.val))));
        while(!stack.isEmpty()){
            Pair p = stack.pop();
            TreeNode node = p.node;
            int sum = p.val;
            List<Integer> current = p.path;
            //check if left
            if(node.right == null && node.left == null && sum == targetSum){
                res.add(current);
            }

            if(node.left != null){
                //create new path to save into this
                List<Integer> newPath = new ArrayList<>(current);
                newPath.add(node.left.val);
                stack.push(new Pair(sum+node.left.val, node.left, newPath));
            }
            if(node.right != null){
                List<Integer> newPath = new ArrayList<>(current);
                newPath.add(node.right.val);
                stack.push(new Pair(sum+node.right.val, node.right , newPath));
            }
        }
        return res;
    }

    //Solution 2:Redo again
}
