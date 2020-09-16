package com.JavaAlgos.ColtSteele.SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * O(n*log(n)) is the best a sorting algo can do TimeComplexity O(n*log(n))
 * SpaceComplexity O(n). log(n) splits to get to the single element arrays. n is
 * the number of comparisons that need to be made So the time complexity for an
 * 4 element array is: comparing 4 different elements 2 times (4) * Log(4) => 4
 * * 2 = 8. Have to compare when sorting the two halfs
 */
public class MergeSort {

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(33);
        arr1.add(3);
        arr1.add(4);
        arr1.add(24);
        arr1.add(939);
        arr1.add(66);

        // ArrayList<Integer> arr2 = new ArrayList<>();
        // arr2.add(2);
        // arr2.add(14);
        // arr2.add(99);
        // arr2.add(100);
        // System.out.println(Arrays.toString(MergeArrayLists(arr2, arr1).toArray()));
        // // even if one of the arrays was longer then the other. All we would have to
        // do
        // // is
        // // add the left over elements of that array onto the result array. And
        // // everything
        // // would be sorted, since we are mergeing two SORTED arrays in the first
        // place

        System.out.println(Arrays.toString(MergeSortNow(arr1).toArray()));
    }

    public static List<Integer> MergeSortNow(List<Integer> arr) {
        if (arr.size() <= 1)
            return arr;
        int middle = (arr.size()) / 2;
        List<Integer> arr1;
        List<Integer> arr2;

        arr1 = arr.subList(0, middle);
        arr2 = arr.subList(middle, arr.size());
        /**
         * At the end you want two big sorted lists to pass into "MergeArrayLists" so
         * that it can output a nice sorted array. To get that, you will first have to
         * break up the big inital array you passed in, into smaller pieces. And then
         * some how start sorting them.
         * 
         * You do this by recursively breaking up the problem into smaller parts By
         * recursively calling MergeSortNow on two different halfs of the intial array
         * passed in. By doing this you get to the base case of passing in an array that
         * is only size one.
         * 
         * Once this happens, MergeSortNow will just return two one size elements into
         * MergeArrayLists, and it will return a sorted array made up of the two one
         * element arrays
         * 
         * Example below:
         * 
         * arr1 = [1] arr2 = [2]
         * 
         * MergeArrayLists(MergeSortNow(arr1), MergeSortNow(arr2)) MergeSortNow(arr1)
         * returns [1] MergeSortNow(arr2) returns [2] MergeArrayLists([1],[2]) returns
         * [1,2]
         * 
         * MergeArrayLists([1,2],MergeSortNow([4,3]))
         * 
         * MergeArrayLists([1,2],[4,3]) returns [1,2,4,3]
         * 
         * Its just a merging of a bunch of different returns, which are mini problems
         * created by pieces of smaller problems
         */
        return MergeArrayLists(MergeSortNow(arr1), MergeSortNow(arr2));
    }

    // merging two sorted arrays
    public static List<Integer> MergeArrayLists(List<Integer> arr1, List<Integer> arr2) {
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
