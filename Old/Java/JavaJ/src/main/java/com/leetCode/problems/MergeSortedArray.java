package com.leetCode.problems;

public class MergeSortedArray {

    /*
    * So you are building it from the back.
    * You have two pointers tail1 and tail2 and you keep comparing them
    * to each other. And you set which ever one is bigger then the other
    * to the current place in the back using the finished pointer.
    *
    * And the second on the tail pointers become negative you stop.
    * If there is something still left in the nums2 you add it to the
    * rest of the array since that would mean T1 died first, and everything
    * in nums2 is smaller. So you just add it on.
    *
    * */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail1 = m - 1, tail2 = n - 1, finished = m + n - 1;
        while (tail1 >= 0 && tail2 >= 0) {
            nums1[finished--] = (nums1[tail1] > nums2[tail2]) ?
                    nums1[tail1--] : nums2[tail2--];
        }

        while (tail2 >= 0) { //only need to combine with remaining nums2
            nums1[finished--] = nums2[tail2--];
        }
    }
}
