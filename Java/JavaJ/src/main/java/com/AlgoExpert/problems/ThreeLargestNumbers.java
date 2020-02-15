package com.AlgoExpert.problems;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class ThreeLargestNumbers {

    public static void main(String[] args){
        int[] arrsy = findThreeLargestNumbers2(new int[] {44,33,233,55,6666,7,1,44,54444});
        for(int i : arrsy){
            System.out.println(i);
        }
    }

    /*
    * Solution 2
    *
    * just have to shift one down each time
    * Do biggest to the smallest
    *
    * Time: O(n)
    * Space: O(1)
    * */
    public static int[] findThreeLargestNumbers2(int[] array) {
        int[] answer = new int[3];
        answer[0] = Integer.MIN_VALUE;
        answer[1] = Integer.MIN_VALUE;
        answer[2] = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > answer[2] && array[i] > answer[1] && array[i] > answer[0]){
                int temp2 = answer[2];
                answer[2] = array[i];
                int temp1 = answer[1];
                answer[0] = temp1;
                answer[1] = temp2;
                continue;
            } else if(array[i] > answer[1] && array[i] > answer[0]){
                int temp1 = answer[1];
                answer[1] = array[i];
                answer[0] = temp1;
                continue;
            }else if(array[i] > answer[0]){
                answer[0] = array[i];
                continue;
            }
        }
        return answer;
    }

    /*
    * Solution One
    * */
    public static int[] findThreeLargestNumbers(int[] array) {
        List<Integer> arrayl = new ArrayList<Integer>(array.length);
        for (int i : array)
        {
            arrayl.add(i);
        }
        ArrayList<Integer> answers = new ArrayList<Integer>();
        int currentMaxIndex = maxIndex(arrayl);

        answers.add(0,arrayl.get(currentMaxIndex));
        arrayl.remove(currentMaxIndex);
        //System.out.println(arrayl);

        currentMaxIndex = maxIndex(arrayl);
        answers.add(0,arrayl.get(currentMaxIndex));
        arrayl.remove(currentMaxIndex);
        //System.out.println(arrayl);

        currentMaxIndex = maxIndex(arrayl);
        answers.add(0,arrayl.get(currentMaxIndex));
        arrayl.remove(currentMaxIndex);
        int[] temp = new int[3];
        temp[0] = answers.get(0);
        temp[1] = answers.get(1);
        temp[2] = answers.get(2);

        return temp;
    }

    public static int maxIndex(List<Integer> arrayl){
        int currentMax = Integer.MIN_VALUE;
        int currentMaxIndex = 0;
        for(int i =0; i < arrayl.size(); i++){
            if(arrayl.get(i) > currentMax){
                currentMax = arrayl.get(i);
                currentMaxIndex = i;
            }
        }
        return currentMaxIndex;
    }
}
