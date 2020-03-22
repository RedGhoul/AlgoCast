package com.leetCode.problems;

public class PowerofThree {
    /*
    * Keep dividing till you see a reminder or not
    *
    * Only stop when n = 1 meaning 3 / 3 has happend.
    * */
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
        while(true){
            if(n == 1){
                return true;
            }
            if(n % 3 == 0){
                n = n / 3;
            }else{
                return false;
            }
        }
    }
}
