package com.JavaAlgos.StephenGrider;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args){
        System.out.println(findAnagram("rail safety","fairy tales"));
        System.out.println(findAnagram("RAIL SAFETY!","fairy tales"));
        System.out.println(findAnagram("Hi there","Bye there"));
        System.out.println(findAnagram("hello","llohe"));
        System.out.println(findAnagram("Whoa! Hi!","Hi! Whoa!"));
        System.out.println(findAnagram("One One","Two two two"));
        System.out.println(findAnagram("One one","One one c"));
        System.out.println(findAnagram("A tree, a life, a bench","A tree, a fence, a yard"));
    }
    /*
    * Q: Given two string, determine if they are an anagram or not.
    * Only consider letters, no spaces, no punctuation.
    * Consider capitals to be the same as lower cases.
    * A string is an anagram of another if it uses the same chars, in the
    * same amount.
    * Input: two strings
    * output: boolean value. True = isAnagram, False = is not Anagram
    * */
    public static boolean findAnagram(String input1, String input2){
        if(input1 == null || input2 == null) return false;
        input1 = input1.replace(" ","");
        input2 = input2.replace(" ","");

        input1 = input1.replaceAll("\\p{Punct}","");
        input2 = input2.replaceAll("\\p{Punct}","");

        if(input1.length() != input2.length()) return false;
        HashMap<String,Integer> input1Hash = createHashMap(input1);
        HashMap<String,Integer> input2Hash = createHashMap(input2);

        for(Map.Entry<String,Integer> entry: input1Hash.entrySet()){
            String curKey = entry.getKey();
            if(!input2Hash.containsKey(curKey) || input2Hash.get(curKey)!= entry.getValue()){
                return false;
            }
        }

        return true;

    }

    public static HashMap<String,Integer> createHashMap(String Input){
        if(Input.length() == 0) return null;
        HashMap<String,Integer> inputHash = new HashMap<String,Integer>();
        char[] inputArr = Input.toCharArray();
        for(int i =0; i < inputArr.length; i++){
            String curKey = String.valueOf(inputArr[i]).toLowerCase();
                if(inputHash.containsKey(curKey)){
                    inputHash.put(curKey, inputHash.get(curKey) + 1);
                }else{
                    inputHash.put(curKey,1);
                }
        }
        return inputHash;
    }
}
