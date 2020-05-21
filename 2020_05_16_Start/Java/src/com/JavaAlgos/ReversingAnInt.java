package com.JavaAlgos;

public class ReversingAnInt {
    public static void main(String[] args){
        System.out.println(ReverseInt(0));
        System.out.println(ReverseInt(5));
        System.out.println(ReverseInt(15));
        System.out.println(ReverseInt(90));
        System.out.println(ReverseInt(2359));
        System.out.println(ReverseInt(-5));
        System.out.println(ReverseInt(-15));
        System.out.println(ReverseInt(-90));
        System.out.println(ReverseInt(-2359));
        System.out.println(ReverseInt(90325));
    }

    /*
    * Q: Given an Int reverse it. This includes negative numbers
    * Input: int type, any number, neg pos
    * Output: String type, if a neg number then add "-" to the string
    * */
    public static String ReverseInt(int input){
        boolean isNeg = input < 0;
        String inputS = Integer.toString(input); // converting to a string

        char[] inputSArr = inputS.toCharArray();
        int p1 = 0;
        int p2 = inputSArr.length -1;
        while(p1 < p2) {
            char temp = inputSArr[p1];
            inputSArr[p1] = inputSArr[p2];
            inputSArr[p2] = temp;

            p1++;
            p2--;
        }
        String finalAnswer = String.valueOf(inputSArr);
        while(finalAnswer.charAt(0) == '0' && finalAnswer.length() > 1){
            finalAnswer = finalAnswer.substring(1);
        }

        // java gives you the neg in the char array
        if(isNeg) {
            finalAnswer = finalAnswer.replace("-","");
            finalAnswer = "-" + finalAnswer;
        }

        return finalAnswer;
    }
}
