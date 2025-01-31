import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class lambda {
    public static void main(String[] args) {
        LinkedList<String> q = new LinkedList<String>();
        Stack<Integer> a = new Stack<>();
        q.offer("a");
        q.offer("b");
        //System.out.println(q.poll());
        a.push(2);
        a.push(3);
        a.push(4);
        System.out.println(a.peek());
    }


/*
    public static int r(int n) {
        if (n <= 0)
            return 0;
        else
            return r(n - 1) + n;
    }


    //2
    public static int r(int n){
        if (n <= 1) {
            return n;
        }
        return r(n - 1) + r(n - 2);
    }
*/

    /*
    //1
    public static void rev(int n) {
        if (n == 0)
            System.out.println(n);
        else {
            System.out.print(n + " ");
            rev(n / 10);
        }
    }*/


    //2

    //5
   /* public static int r(int n){
        if(n==0) return 1;
        else return n*((n+1)/2);
    }*/

    /*
    //3

    static void r(int n) {
        if (n > 100)
            System.out.println(n);
        else {
            System.out.print(n + " ");
            r(n * 10);
        }
    }
*/
    //4

    public static int r(int n) {
        if (n == 1){
            return 0;
        }else{
            return (n+1/2)*3;
        }
    }


    /*

    //5
    public static int r(int n) {
        if (n == 0)
            return 1;
        else
            return n * r(n / 2);
    }

    */
    //6
     /*
    public static int r2(int n) {
        if (n <= 0)
            return 0;
        else
            return r(n/2) + n*n;
    }


    //7
    public static int r9(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return r9(n - 2) + r9(n / 2);
    }

    //8

    public static void r(int n) {
        if (n >= 0) {
            r(n - 1);
            System.out.print(n + " ");
            r(n - 2);
        }
    }
*/
}


