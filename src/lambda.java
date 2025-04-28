import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

import static BST.sqrt_69.mySqrt;
public class lambda {
    public static void main(String[] args) {
        //System.out.println( r(1));
        String regex = "^[0-9_]+$";
        String a = "ab1-c2d";
        Character t = '-';



        System.out.println(Math.floor(Math.sqrt(1)));
    }



int n=10;

    /*
    //1
    public static void r(int n) {
        if (n == 0)
            System.out.println(n);
        else {
            System.out.print(n + " ");
            r(n / 10);
        }
    }*/

    //2
    /*
    public static int r(int n) {
        if (n <= 0)
            return 0;
        else
            return r(n/2) + n*n;
    }*/

    //3
    /*
    public static void r(int n) {
        if (n > 100)
            System.out.println(n);
        else {
            System.out.print(n + " ");
            r(n * 10);
        }
    }
*/

    //4
    public static int gcd(int m, int n) {
        if ((m == 0) || (n == 0))
            return 1;
        if (m % n == 0) {
            return n;
        }
        else {
            return gcd(n, m%n);
        }
    }


    public static void r(int n,String a) {


    }

    public static void r(String a,int n) {


    }

}


