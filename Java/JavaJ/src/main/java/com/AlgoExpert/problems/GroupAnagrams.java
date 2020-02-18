package com.AlgoExpert.problems;

import java.util.*;

public class GroupAnagrams {
    /*
    * Time (w * n * Log(n)) : the N*Log(N) is due to use sorting each word
    * and the W is for the amount of words we have to go through (Words in the array)
    *
    * */
    public static List<List<String>> groupTheAnagrams(List<String> words) {
        if(words.size() == 0){
            return new ArrayList<List<String>>();
        }
        HashMap<String,List<String>> wordBucket = new HashMap<String,List<String>>();
        List<List<String>> tempAlpha = new ArrayList<List<String>>();

        for(int i = 0; i < words.size(); i++){
            String curString = words.get(i);
            char[] tempArr = curString.toCharArray();
            Arrays.sort(tempArr);
            String sorted = new String(tempArr);
            if(wordBucket.containsKey(sorted)){
                List<String> current = wordBucket.get(sorted);
                current.add(curString);
                wordBucket.put(sorted, current);
            }else{
                ArrayList<String> temp = new ArrayList<String>();
                temp.add(curString);
                wordBucket.put(sorted,temp);
            }
        }
        for(Map.Entry<String, List<String>> entry: wordBucket.entrySet()){
            tempAlpha.add(entry.getValue());
        }
        return tempAlpha;
    }


}
}
