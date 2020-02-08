package com.AlgoExpert.problems;

import java.util.HashMap;

public class CaesarCipherEncryptor {
    public static void main(String[] args){
        System.out.println(caesarCypherEncryptor("xyz",2));
    }

    public static String caesarCypherEncryptor(String input, int key){
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
