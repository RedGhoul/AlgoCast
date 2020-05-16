package com.leetCode.problems;

import java.util.ArrayList;

public class ValidParentheses {
    /*
    * Use stacks bro
    * */
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        if(s.length() == 1) return false;
        String[] input = s.split("");
        ArrayList<String> stack = new ArrayList<String>();
        for(int i =0; i < input.length; i++){
            String curChar = input[i];
            if(curChar.equals("(") || curChar.equals("{") || curChar.equals("[")){
                stack.add(curChar);
            }else{
                if(stack.size() == 0) return false;
                int size = stack.size() - 1;
                String compare = stack.remove(size);
                boolean curlB = compare.equals("(") && curChar.equals(")");
                boolean curlS = compare.equals("[") && curChar.equals("]");
                boolean curlSw = compare.equals("{") && curChar.equals("}");
                if(curlB == false && curlS == false && curlSw == false){
                    return false;
                }
            }
        }
        return stack.size() > 0 ? false : true;
    }
}
