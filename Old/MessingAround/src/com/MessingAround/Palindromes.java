package com.MessingAround;

public class Palindromes {
    /*
    * Not considering string sanitization (white spacing)
    * Not considering how valid the string is (spacing)
    * Not considering if the string has numbers in it
    *
    * If I would have to take this stuff into account, than it
    * would be a lot more complicated and would have to use:
    * Character.isDigit()
    * Character.isLetter()
    *
    * better thing then that would be to use Character.isLetterOrDigit(cHead)
    * */
    public static void main(String[] args){
        System.out.println(isPalindrome("aba"));
        System.out.println(isPalindrome("greetings"));
        System.out.println(isPalindrome("pennep"));
    }

    public static boolean isPalindrome(String input){
        // input checking
        if(input.length() == 0) return false;
        if(input.length() == 1) return true;

        char[] inputArray = input.toCharArray();
        int start = 0;
        int end = input.length() - 1;
        while(start < end){
            // How you would do with with all the constraints
            char head = inputArray[start];
            char tail = inputArray[end];
            if(!Character.isLetterOrDigit(head)){
                // moving the start forward
                // since the char at index start of inputArray is
                // not a Letter or Digit
                start++;
            }else if (!Character.isLetterOrDigit(tail)){
                end--;
            }else{
                if(head != tail){
                    return false;
                }
                start++;
                end--;
            }
//            if(inputArray[start] != inputArray[end]){
//                return false;
//            }
//            start++;
//            end--;
        }
        return true;
    }
}
