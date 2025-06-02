package BinaryTree;

import java.util.Stack;

public class SumRootToLeaf_1022 {
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

    class Pair{
        StringBuilder path;
        TreeNode node;
        public Pair(StringBuilder path, TreeNode node) {
            this.path = path;
            this.node = node;
        }
    }

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) return 0;
        //
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(new StringBuilder().append(root.val), root));
        //
        int sum=0;
        while(!stack.isEmpty()) {
            Pair p = stack.pop();
            StringBuilder path = p.path;
            TreeNode curr = p.node;
            //
            if(curr.left == null && curr.right == null){
                sum+= convertBin(path);
            }
            //if leaf -> add into
            if(curr.left != null){
                StringBuilder temp = new StringBuilder(path);
                stack.push(new Pair(temp.append(curr.left.val),curr.left));
            }
            if(curr.right != null){
                StringBuilder temp = new StringBuilder(path);
                stack.push(new Pair(temp.append(curr.right.val),curr.right));
            }
        }
        return sum;
    }
    //bin -> dec
    int convertBin(StringBuilder path) {
        int sum = 0;
        int i=0;
        while(i < path.length()){
            sum = sum*2+path.charAt(i)-'0';
            i++;
        }
        return sum;
    }
}
