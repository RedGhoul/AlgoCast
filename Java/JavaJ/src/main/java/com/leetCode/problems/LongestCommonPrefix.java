package com.leetCode.problems;

public class LongestCommonPrefix {
    public static String find(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        for(int i = 1; i < strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){ // cause we want it to start from the beginning
                // have to remove letters starting from the back since you
                // are only looking if the "prefixs" to match up. So you can't remove from the beginning.
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.length() == 0){
                    return "";
                }
            }
        }
        return prefix;
    }
}
