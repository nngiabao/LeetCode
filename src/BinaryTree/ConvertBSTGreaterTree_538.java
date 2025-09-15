package BinaryTree;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.Stack;

public class ConvertBSTGreaterTree_538 {
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

    class CustomNode{
        boolean isVisited;
        TreeNode node;
        //
        public CustomNode(TreeNode node,boolean isVisited){
            this.node = node;
            this.isVisited = isVisited;
        }
    }
    //
    public TreeNode convertBST(TreeNode root) {
        Stack<CustomNode> stack = new Stack<>();
        stack.push(new CustomNode(root,false));
        //

        int sum = 0;
        while(!stack.isEmpty()){
            CustomNode cur = stack.pop();
            //chekc if not visited
            if (cur.node == null) continue;
            if(!cur.isVisited){
                if(cur.node.left != null) stack.push(new CustomNode(cur.node.left,false));
                //add back this node => we can add to sum this current node
                stack.push(new CustomNode(cur.node,true));
                if(cur.node.right != null) stack.push(new CustomNode(cur.node.right,false));
            }else{
                sum += cur.node.val;
                cur.node.val = sum;
            }
        }
        //
        return root;
    }
    //Solution 2:Recursion not done
}
