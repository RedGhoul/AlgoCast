package com.JavaAlgos.ColtSteele.SearchingAlgorithms;
// subject should return the correct index if the value is found

// Expected undefined to be 1, 'binarySearch([1,2,3,4,5],2) should be 1.'.
// Expected undefined to be 2, 'binarySearch([1,2,3,4,5],3) should be 2.'.
// Expected undefined to be 4, 'binarySearch([1,2,3,4,5],5) should be 4.'.
// Expected undefined to be 2, 'binarySearch([5, 6, 10, 13, 14, 18, 30, 34, 35, 37, 40, 44, 64, 79, 84, 86, 95, 96, 98, 99], 10) should be 2.'.
// Expected undefined to be 16, 'binarySearch([5, 6, 10, 13, 14, 18, 30, 34, 35, 37, 40, 44, 64, 79, 84, 86, 95, 96, 98, 99], 95) should be 16.'.
public class BinarySearch {
    public static void main(String[] args) {
        // System.out.println(BinarySearch.findIntInArray(new int[] { 1, 2, 3, 4, 5 },
        // 2));
        System.out.println(BinarySearch.findIntInArray(new int[] { 1, 2 }, -3));
        System.out.println(BinarySearch.findIntInArray(new int[] { 1, 2, 3, 4, 5 }, 5));
        System.out.println(BinarySearch.findIntInArray(
                new int[] { 5, 6, 10, 13, 14, 18, 30, 34, 35, 37, 40, 44, 64, 79, 84, 86, 95, 96, 98, 99 }, 10));
        System.out.println(BinarySearch.findIntInArray(
                new int[] { 5, 6, 10, 13, 14, 18, 30, 34, 35, 37, 40, 44, 64, 79, 84, 86, 95, 96, 98, 99 }, 95));
        System.out.println(BinarySearch.findIntInArray(
                new int[] { 5, 6, 10, 13, 14, 18, 30, 34, 35, 37, 40, 44, 64, 79, 84, 86, 95, 96, 98, 99 }, 100));
    }

    /***
     * 
     * Assuming everything is in order
     * 
     * @param arr
     * @param target
     * @return
     */
    public static int findIntInArray(int[] arr, int target) {
        if (arr.length == 0)
            return -1;
        int startP = 0;
        int endP = arr.length - 1;
        int middleP = 0;
        while (startP <= endP) { // since we want to be able to conversion one of two extremes
            // your looking for position not distance, which is why you add
            middleP = (endP + startP) / 2;
            int middleValue = arr[middleP];
            if (middleValue == target)
                return middleP;

            /**
             * You want to be able to converge at one of the two ends of the array. If you
             * just set the endP and StartP to the middleP. you would run the risk of
             * getting into a infinite loop where your middleP stays the same. 1 + 0 / 2 = 0
             * = middleP endP = 0 0 + 0 / 2 = 0 = middleP And so endP will always be equal
             * to startP which will result in a inifinite loop That is why we use -1 for
             * looking in the left side of the array And why we use + 1 for looking at the
             * right side of the array
             */
            if (middleValue > target) { // we went too high
                endP = middleP - 1;
            } else { // we went to low
                startP = middleP + 1;
            }
        }
        if (middleP != target)
            return -1;
        return middleP;
    }
}
