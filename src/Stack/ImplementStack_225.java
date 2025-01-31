package Stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ImplementStack_225 {
    public static void main(String[] args) {}

    Deque<Integer> q;
    public ImplementStack_225(){
        q = new LinkedList<Integer>();
    }

    public void push(int x) {
        q.offer(x);
    }

    public int pop() {
        return q.removeLast();
    }

    public int top() {
        return q.peekLast();
    }

    public boolean empty() {
        if(q.size()==0) return true;
        return false;
    }
}
