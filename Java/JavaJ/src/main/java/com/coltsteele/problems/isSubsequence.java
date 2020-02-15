package com.coltsteele.problems;

/*
* checks if the characters in the first string come up
* as a subsequence in the second string. checks whether the chars in the first string
* appear somewhere in the second string without their order changing
* */
public class isSubsequence {
    public static void main(String[] args){
        System.out.println(isSubsequence.isSubsequence("hello","hello world"));
    }

    /*
    * First thought is some sort of double for loop. However a while loop with pointers
    * would have a better space complexity.
    *
    * Assuming the stringToLookFor will always be smaller then the searchSpace
    * Assuming that the there needs to be some sort of case sensitivity
    * Assuming connective order
    * */
    public static boolean isSubsequence(String stringToLookFor, String searchSpace){
        if(stringToLookFor.isEmpty() || searchSpace.isEmpty()){
            return false;
        }
        int stringToLookForP = 0;
        int searchSpaceP = 0;

        while(true){
            if(stringToLookForP == stringToLookFor.length() && searchSpaceP == searchSpace.length()){
                return true;
            }
            if(stringToLookForP == stringToLookFor.length()){
                return true;
            }
            if(searchSpaceP == searchSpace.length()){
                return false;
            }
            if(stringToLookFor.charAt(stringToLookForP) == searchSpace.charAt(searchSpaceP)){
                searchSpaceP++;
                stringToLookForP++;
            }else{

//                // reset it to start looking from zero
//                stringToLookForP =0;
                searchSpaceP++;
            }
        }
    }
}
