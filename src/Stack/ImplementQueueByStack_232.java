package Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ImplementQueueByStack_232 {

    public static void main(String[] args) {
        ImplementQueueByStack_232 a = new ImplementQueueByStack_232();
        a.push(1);
        a.push(2);
        System.out.println(a.peek());
        System.out.println(a.pop());
    }
    Deque<Integer> stack;
    public ImplementQueueByStack_232() {
        stack = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.addLast(x);
    }

    public int pop() {
        return stack.removeFirst();
    }

    public int peek() {
        return stack.peekFirst();
    }

    public boolean empty() {
        return stack.isEmpty();
    }
}
