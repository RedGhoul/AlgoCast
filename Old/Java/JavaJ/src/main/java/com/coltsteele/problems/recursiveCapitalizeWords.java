package com.coltsteele.problems;

/*
* Given an array of works capitalize them
* */
public class recursiveCapitalizeWords {
    public static void main(String[] args){
        String[] temp =recursiveCapitalizeWords.capitalize(new String[] {"hello","you","cat","dog"},null);
        for (String tem: temp) {
            System.out.println(tem);
        }
    }

    public static String[] capitalize(String[] words, Integer index){
        if(index == null){
            index = 0;
        }
        if(index > words.length-1){
            return words;
        }

        words[index] = words[index].toUpperCase();
        return capitalize(words,index+1);
    }
}
