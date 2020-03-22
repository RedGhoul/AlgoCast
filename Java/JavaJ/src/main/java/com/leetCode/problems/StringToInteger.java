package com.leetCode.problems;

public class StringToInteger {
    public static void main(String[] args){
        myAtoi("44");
    }
    public static int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;//
        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        char firstChar = str.charAt(0);
        int sign = 1, start = 0, len = str.length();
        long sum = 0;
        if (firstChar == '+') {
            sign = 1;
            start++;
        } else if (firstChar == '-') {
            sign = -1;
            start++;
        }else if(!Character.isDigit(firstChar)){
            return 0;
        }
        for (int i = start; i < len; i++) {
            if (!Character.isDigit(str.charAt(i)))
                return (int) sum * sign;
            sum = (sum * 10) + str.charAt(i) - '0';
            if (sign == 1 && sum > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign == -1 && (-1) * sum < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) sum * sign;
    }
}
