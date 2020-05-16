package com.leetCode.problems;

public class ImplementStrStr {
    public static void main(String[] args){
//        "mississippi"
//        "issip"
//        "aaaaa"
//        "bba"
        strStrnew("mississippi","issip");
        strStrnew("aaaaa","bba");
    }
    public static int strStrnew(String haystack, String needle) {
        // empty needle appears everywhere, first appears at 0 index
        if (needle.length() == 0)
            return 0;
        if (haystack.length() == 0)
            return -1;


        for (int i = 0; i < haystack.length(); i++) {
            // i + needle.length() = how much space is left for the needle
            if (i + needle.length() > haystack.length()) break;

            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i+j) != needle.charAt(j))
                    break;
                if (j == needle.length()-1)
                    return i;
            }
        }

        return -1;
    }
    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        if(haystack.length() == 0){
            return -1;
        }

        String[] haystackA = haystack.split("");
        String[] needleA = needle.split("");


        int count = 0;
        int firstIndex = 0;
        int j = 0;
        for(int i = 0; i < haystackA.length; i++){
            if(j >=needleA.length){
                break;
            }
            if(haystackA[i].equals(needleA[j])){
                if(count == 0){
                    firstIndex = i;
                }
                count++;
                j++;
            }else{
                count =0;
                j = 0;
                if(i > 2 && haystackA[i-1].equals(needleA[j])){
                    i = i - 2;
                }
            }
        }
        if(count == needleA.length){
            return firstIndex;
        }else{
            return -1;
        }

    }
}
