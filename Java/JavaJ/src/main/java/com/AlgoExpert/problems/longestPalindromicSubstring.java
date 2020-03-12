package com.AlgoExpert.problems;

public class longestPalindromicSubstring {
    public static String getlongestPalindromicSubstring(String str) {
        int[] currentLongest = new int[]{1,0};
        for(int i =0; i < str.length(); i++){
            int[] odd = getP(str,i-1,i+1);
            int[] even = getP(str,i-1,i);
            int[] longest = odd[1] - odd[0] > even[1] - even[0] ? odd : even;
            currentLongest = currentLongest[1] - currentLongest[0] > longest[1] - longest[0] ? currentLongest : longest;
        }
        return str.substring(currentLongest[0], currentLongest[1]);
    }

    public static int[] getP(String input, int start, int end){
        while(start >= 0 && end < input.length()){
            if(input.charAt(start) == input.charAt(end)){
                start--;
                end++;
            }else{
                break;
            }
        }
        return new int[]{start+1,end};// ususally start is the one that goes out of bounds first before end
        // since we start doing this near the beginning
    }
}
