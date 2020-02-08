package com.AlgoExpert.problems;

import java.util.HashMap;

public class CaesarCipherEncryptor {
    public static void main(String[] args){
        System.out.println(caesarCypherEncryptorV2("xyz",2));
    }

    public static String caesarCypherEncryptorV2(String input, int key){
        if(input.length()== 0){
            return "";
        }

        String[] inputArray = input.split("");

        for(int i =0; i < inputArray.length; i++){
            String newLetter = encryptByLetterV2(inputArray[i],key);
            inputArray[i] = newLetter;
        }

        return String.join("",inputArray);
    }

    /**
     * This way works to but is kind of inefficient since we have to use indexOf
     * **/
    public static String encryptByLetterV2(String input, int key){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int inputIndex = alphabet.indexOf(input) + key +1;

        if(inputIndex > 26){
            /*
            * -1 since we want to undo the plus one up there.
            * inputIndex % 26 since we just want the reminder aka where it would end up
            * on the alphabet index
            * */
            return Character.toString(alphabet.charAt(-1 + inputIndex % 26));
        }else{
            return Character.toString(alphabet.charAt(inputIndex-1));
        }

    }

    public static String caesarCypherEncryptorV1(String input, int key){
        if(input.length()== 0){
            return "";
        }

        String[] inputArray = input.split("");

        for(int i =0; i < inputArray.length; i++){
            String newLetter = encryptByLetter(inputArray[i],key);
            inputArray[i] = newLetter;
        }

        return String.join("",inputArray);
    }

    /**
     * I think this is the way that would be the most time efficient
     * But cost more in Space. Also would have to make a static version of the
     * dict rather then create a new one per function call
     * **/
    public static String encryptByLetter(String input, int key){
        String[] alphabet = "abcdefghijklmnopqrstuvwxyz".split("");
        HashMap<String,Integer> alphabetHash = new HashMap<String,Integer>();
        for(int i =0; i < alphabet.length; i++){
            alphabetHash.put(alphabet[i],i+1);
        }

        int inputIndex = alphabetHash.get(input) + key;

        if(inputIndex > alphabet.length){
            int newIndex = inputIndex - 26;
            while(newIndex > 26){ // just incase they give us something massive like a key of a 100000
                newIndex = newIndex - 26;
            }
            return alphabet[newIndex-1];
        }else{
            return alphabet[inputIndex-1];
        }

    }

}
