import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class n_arrayPostorder_590 {
    public List<Integer> postorder(Node root) {
        Stack<Node> stack = new Stack<Node>();
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        stack.push(root);
        while(!stack.isEmpty()) {
            Node node = stack.pop();
            result.add(0,node.val);
            if(node.children != null) {
                for(Node child : node.children) {
                    stack.push(child);
                }
            }
        }
        return result;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
