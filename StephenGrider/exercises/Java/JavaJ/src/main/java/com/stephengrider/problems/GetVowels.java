package com.stephengrider.problems;

// --- Directions
// Write a function that returns the number of vowels
// used in a string.  Vowels are the characters 'a', 'e'
// 'i', 'o', and 'u'.
// --- Examples
//   vowels('Hi There!') --> 3
//   vowels('Why do you ask?') --> 4
//   vowels('Why?') --> 0

import java.util.ArrayList;
import java.util.HashMap;

public class GetVowels {


    public static int getVowelsInInput(String input){
        ArrayList<String> vowelsList = new ArrayList<String>();
        vowelsList.add("a");
        vowelsList.add("e");
        vowelsList.add("i");
        vowelsList.add("o");
        vowelsList.add("u");
        int vowelCount = 0;
        for(int index=0; index < input.length(); index++){
            String currentStr = Character.toString(input.charAt(index)).toLowerCase();
            /*
            * This is using the built in contains method of the ArrayList class
            * However its still kind of a linear search.
            *
            * So you could have do it using a big logic statement in the if like:
            *
            * if(currentStr == "a" || currentStr=="e" || and so on
            * */
            if(vowelsList.contains(currentStr)) {
                vowelCount++;
            }
        }

        return vowelCount;
    }
}
