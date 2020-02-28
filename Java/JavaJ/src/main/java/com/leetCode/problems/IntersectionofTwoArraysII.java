package com.leetCode.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionofTwoArraysII {
//    [4,9,5]
//            [9,4,9,8,4]

//    [54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41]
//            [17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20]
    public static void main(String[] args){
        intersect(new int[]{54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41},new int[]{17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20});
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> ssv = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> ssv2 = new HashMap<Integer, Integer>();
        int[] hashDump = null;
        int[] finder = null;

        if (nums1.length > nums2.length) {
            hashDump = nums1;
            finder = nums2;
        } else {
            hashDump = nums2;
            finder = nums1;
        }

        for (int x = 0; x < hashDump.length; x++) {
            if (ssv.containsKey(hashDump[x])) {
                ssv.put(hashDump[x], ssv.get(hashDump[x]) + 1);
            } else {
                ssv.put(hashDump[x], 1);
            }
        }

        List<Integer> end = new ArrayList<Integer>();
        for (Integer x : finder) {
            boolean contains = ssv.containsKey(x);
            if(contains){
                /*
                * We just do the following below to make sure we only
                * add to the end as much as we need to. So when we get
                * a value you of 1 we subtract it, put it back. And then
                * add the key (x) to the end
                * */
                int value = ssv.get(x);
                if (value > 0) {
                    ssv.put(x , ssv.get(x)-1);
                    end.add(x);
                }
            }

        }

        int[] i = new int[end.size()];
        for (int x = 0; x < end.size(); x++) {
            i[x] = end.get(x);
        }
        return i;
    }
}
