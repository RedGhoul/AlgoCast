package com.leetCode.problems;

public class FirstBadVersion {
    /*
    * The best way to do it. Memory requirements so large for recursive solution
    * Need to do it the iterative way.
    * */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public int firstBadVersionReCur(int n) {
        //use binary search
        return isBadHelperRecur(0,n);
    }

    public static int isBadHelperRecur(int start, int end) {
        //use binary search
        if(start >= end){
            return start;
        }
        int n = end + start;
        int middle = (int)Math.floor(n / 2);
        if(isBadVersion(middle) == true){
            return isBadHelperRecur(0,middle);
        }else {
            return isBadHelperRecur(middle+1, end);
        }
    }

    public static boolean isBadVersion(int input){
        return false;
    }


}
