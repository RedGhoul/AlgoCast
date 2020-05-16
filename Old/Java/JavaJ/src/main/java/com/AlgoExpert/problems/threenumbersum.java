package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threenumbersum {
    public static void main(String[] args) {
        threeNumberSum(new int[]{12, 3, 1, 2, -6, 5, -8, 6}, 0);
    }

    /*Look at your algo expert notes
    *
    * Long story short:
    * 1) Sort the array with generic built in sort
    * 2) three point strategy
    * 3) One point stays at the start. second one stays at one more then the start. last one stays at the end
    * 4) you keep moving the 2nd one right and the last one left and sum them up to check if they sum up to the target
    * 5) then add the three numbers to your bag
    * 6) then move the first to the left one and repeat the process
    *
    * in doing so you try every combo with out having to use all three loops
    * */
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> answer = new ArrayList<Integer[]>();
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            int start = i;
            int startR = i + 1;
            int end = array.length - 1;

            while (startR < array.length && end > i && startR < end) {
                if (array[startR] == array[end]) {
                    continue;
                }
                int sum = array[start] + array[startR] + array[end];
                if (sum == targetSum) {
                    Integer[] value = new Integer[]{array[start], array[startR], array[end]};
                    Arrays.sort(value);
                    answer.add(value);
                    end--;
                    startR++;
                } else if (sum > targetSum) {
                    end--;
                } else if (sum < targetSum) {
                    startR++;
                }
            }


        }
        return answer;
    }
}
