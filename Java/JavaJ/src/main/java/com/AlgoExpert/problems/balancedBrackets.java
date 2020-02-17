package com.AlgoExpert.problems;

import java.util.ArrayList;

public class balancedBrackets {
    public static boolean TellMeIfThisIsBalanced(String str) {
        ArrayList<String> stack = new ArrayList<String>();
        for(int i =0; i < str.length(); i++){
            String currentChar = Character.toString(str.charAt(i));
            if(currentChar.equals("(") || currentChar.equals("[") || currentChar.equals("{")){
                stack.add(currentChar);
            }else{
                if(stack.size() == 0){
                    return false;
                }else{
                    String openingChar = stack.remove(stack.size()-1);
                    if((openingChar.equals("(") && !currentChar.equals(")")) ||
                            (openingChar.equals("{") && !currentChar.equals("}")) ||
                            (openingChar.equals("[") && !currentChar.equals("]"))){
                        return false;
                    }
                }
            }
        }
        return stack.size() == 0;// check if the stack is equal to zero. if it isn't then it didn't match everything
    }
}
