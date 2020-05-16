package com.JavaAlgos;

public class ReverseString {

    /*
    * Could probably do something with string
    * builder if you really wanted too
    * */
    public static void main(String[] args){
        System.out.println(Reverse1("apple"));
        System.out.println(Reverse1("     apple"));
        System.out.println(Reverse1("apple     "));
        System.out.println(Reverse1("hello"));
        System.out.println(Reverse1("Greetings!"));
        System.out.println(Reverse1(""));
        System.out.println(Reverse1("a"));

        System.out.println(Reverse2("apple"));
        System.out.println(Reverse2("     apple"));
        System.out.println(Reverse2("apple     "));
        System.out.println(Reverse2("hello"));
        System.out.println(Reverse2("Greetings!"));
        System.out.println(Reverse2(""));
        System.out.println(Reverse2("a"));
    }

    /*
    * Does not care about lower or upper case.
    * Or if the char value is punctuation, or if its just about spacing.
    * */
    public static String Reverse1(String input){
        if(input.isEmpty() || input == null) return null;
        if(input.length() == 0 || input.length() == 1) return input;

        char[] inputArray = input.toCharArray();
        int p1 = 0;
        int p2 = inputArray.length-1;
        while(p1 < p2){
            char temp = inputArray[p1];
            inputArray[p1] = inputArray[p2];
            inputArray[p2] = temp;
            p1++;
            p2--;
        }

        return String.valueOf(inputArray);
    }

    /*
    * Taking the back of the string and adding it to the back, one at a time
    * */
    public static String Reverse2(String input){
        if(input.isEmpty() || input == null) return null;
        if(input.length() == 0 || input.length() == 1) return input;

        char[] answer = new char[input.length()];

        for(int i = input.length()-1; i >= 0; i--){
            answer[input.length()-1-i] = input.charAt(i);
        }

        return String.copyValueOf(answer);
    }
}
