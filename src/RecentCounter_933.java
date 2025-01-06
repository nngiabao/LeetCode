import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class RecentCounter_933 {
    Queue<Integer> q;
    public RecentCounter_933() {
        q = new LinkedList<Integer>();
    }

    public int ping(int t) {
        q.add(t);
        while(!q.isEmpty() && q.peek() < t-3000) {
            q.poll();
        }
        return q.size();
    }

    void print() {
        for(int i : q) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        RecentCounter_933 r = new RecentCounter_933();
        int a = r.ping(1);
        int b = r.ping(100);
        int  c = r.ping(3001);
        System.out.println(b);
    }
}