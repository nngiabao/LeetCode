package com.BST;

public class First_bad_version_278 {
    public static void main(String[] args) {
        System.out.println(firstBadVersion2(2126753390));
    }
    //Exp: True True True False False => start from 4 is bad version so we have
    //to find which is first bad ver
    //like 35 exercise but use BST for the best
    //Solution 1
    public static int firstBadVersion(int n) {
        int left = 1, right = n,m,result=0;
        while(left <= right) {
            m = left + (right-left)/ 2;
            if (isBadVersion(m)) {
                result=m;
                right =m-1;
            } else if(!isBadVersion(m)) {
                left=m+1;
            }
        }
        return result;
    }

    //Solution 2 - better
    public static int firstBadVersion2(int n) {
        int left = 1, right = n,m;
        while(left < right) {
            m = left + (right-left)/ 2;
            if (isBadVersion(m)) {
                right =m;
            } else if(!isBadVersion(m)) {
                left=m+1;
            }
        }
        return right;
    }

    public static boolean isBadVersion(int n) {
        int bad=1702766719;
        return n == bad ? true : false;
    }

}
