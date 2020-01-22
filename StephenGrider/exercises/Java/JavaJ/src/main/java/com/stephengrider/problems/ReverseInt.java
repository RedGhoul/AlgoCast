package com.stephengrider.problems;

public class ReverseInt {
    public static void main(String[] args){

    }

    public static int ReverseInt(int input){
        String representation = Integer.toString(input);

        if(representation.contains("-")) {
            // negative case
            String newStringRep = representation.substring(
                    representation.indexOf("-")+1,// you don't want to include this
                    representation.length());// does not take in the very last thing

            String answer = ReverseString(newStringRep);
            answer = "-" + answer;

            int answerInt = Integer.parseInt(answer);
            return answerInt;
        }else {

            String answer = ReverseString(representation);

            int answerInt = Integer.parseInt(answer);
            return answerInt;
        }
    }

    public static String ReverseString(String input){
        String output = "";

        for(int i = 0; i < input.length(); i ++){
            if(!Character.toString(input.charAt(i)).equals("0")){
                output = input.charAt(i) + output;
            }
        }
        return output;
    }
}
