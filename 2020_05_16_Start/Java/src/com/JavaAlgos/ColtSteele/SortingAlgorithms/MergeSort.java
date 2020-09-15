package com.JavaAlgos.ColtSteele.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(10);
        arr1.add(50);

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(2);
        arr2.add(14);
        arr2.add(99);
        arr2.add(100);
        System.out.println(Arrays.toString(MergeArrayLists(arr2, arr1).toArray()));
        // even if one of the arrays was longer then the other. All we would have to do
        // is
        // add the left over elements of that array onto the result array. And
        // everything
        // would be sorted, since we are mergeing two SORTED arrays in the first place
    }

    // merging two sorted arrays
    public static ArrayList<Integer> MergeArrayLists(ArrayList<Integer> arr1, ArrayList<Integer> arr2) {
        if (arr1.isEmpty() && arr2.isEmpty())
            return null;
        if (arr1.isEmpty())
            return arr2;
        if (arr2.isEmpty())
            return arr1;
        ArrayList<Integer> result = new ArrayList<Integer>();
        Integer p1 = 0;
        Integer p2 = 0;
        while (p1 < arr1.size() && p2 < arr2.size()) { // consider the case where one of the arrays is smaller then the
                                                       // other. In that case we would have to account for when either
                                                       // on of the pointers gets too big
            if (arr1.get(p1) < arr2.get(p2)) {
                result.add(arr1.get(p1));
                p1++;
            } else {
                result.add(arr2.get(p2));
                p2++;
            }
        }
        // one of the arrays is going run out. We have to be ready for either of those
        // cases
        while (p1 < arr1.size()) {
            result.add(arr1.get(p1));
            p1++;
        }

        while (p2 < arr2.size()) {
            result.add(arr2.get(p2));
            p2++;
        }
        System.out.println(Arrays.toString(arr1.toArray()));
        System.out.println(Arrays.toString(arr2.toArray()));
        return result;
    }

}
