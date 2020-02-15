package com.coltsteele.problems;
/*
* capitalize the first letter in each string in the array
* */
public class recursiveCapitalizeFirst {

    public static void main(String[] args){
        String[] values = recursiveCapitalizeFirst.CapitalizeFirst(new String[]{"car","taco","banana"},null);
        for (String value: values) {
            System.out.println(value);
        }

    }

    public static String[] CapitalizeFirst(String[] input, Integer index){
        if(index == null){
            index = 0;
        }
        if(index > input.length-1){ //A
            return input;
        }
        String newString = Character.toString(input[index].charAt(0)).toUpperCase()
                + input[index].substring(1,input[index].length());
        input[index] = newString;
        return CapitalizeFirst(input,index+1); // something need to help return the input from its current layer
        // in part A
    }
}
