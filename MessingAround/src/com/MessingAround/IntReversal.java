package com.MessingAround;

public class IntReversal {

    public static void main(String[] args){
        System.out.println(ReverseInt(-2359));
    }

    public static Integer ReverseInt(int input){
        String SInput = Integer.toString(input);
        if(SInput.length() == 0) return input;
        int multiply = 1;
        if(SInput.charAt(0) == '-'){
            multiply = -1;
        }
        char[] CInput = SInput.replace("-","").toCharArray();

        int start = 0;
        int end = CInput.length - 1;
        while(start < end){
            char temp = CInput[start];
            CInput[start] = CInput[end];
            CInput[end] = temp;
            start++;
            end--;
        }
        return multiply * Integer.parseInt(new String(CInput));
    }
}
