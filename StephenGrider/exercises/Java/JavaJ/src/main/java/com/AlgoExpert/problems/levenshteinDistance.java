package com.AlgoExpert.problems;

import java.util.Arrays;

public class levenshteinDistance {
    public static int levenshteinDistance(String str1, String str2) {
        if(str1.length() == 0 && str2.length() == 0){
            return 0;
        }else if(str1.length() == 0){
            return str2.length();
        }else if(str2.length() == 0){
            return str1.length();
        }

        int[][] table = new int[str1.length()+1][str2.length()+1];

        for(int i =0; i < str2.length()+1; i++){
            table[0][i] = i;

        }

        for(int i =0; i < str1.length() + 1; i++){
            table[i][0] = i;

        }

        for(int str1Index =1; str1Index < str1.length()+1; str1Index++){
            for(int str2Index = 1; str2Index < str2.length()+1; str2Index++){

                if(str1.charAt(str1Index-1) == str2.charAt(str2Index-1)){
                    //System.out.println("str1.charAt(str1Index)");
                    table[str1Index][str2Index] = table[str1Index-1][str2Index-1];
                }else{
                    //System.out.println("str2.charAt(str2Index)");
                    table[str1Index][str2Index] =
                            1 + Math.min(table[str1Index-1][str2Index-1],Math.min(table[str1Index-1][str2Index],table[str1Index][str2Index-1]));
                }

            }
        }
        System.out.println(Arrays.deepToString(table));
        System.out.println(table[str1.length()][str2.length()]);
        return table[str1.length()][str2.length()];
    }
}
