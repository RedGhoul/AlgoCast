package com.leetCode.problems;

import java.util.*;

public class MinStack {
    class MinStack2 {
        int min = Integer.MAX_VALUE;
        Stack<Integer> stack = new Stack<Integer>();
        public void push(int x) {
            // only push the old minimum value when the current
            // minimum value changes after pushing the new value x
            if(x <= min){
                stack.push(min);
                min=x;
            }
            stack.push(x);
        }

        public void pop() {
            // if pop operation could result in the changing of the current minimum value,
            // pop twice and change the current minimum value to the last minimum value.
            if(stack.pop() == min) min=stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
    class MinStack1 {

        /** initialize your data structure here. */
        private ArrayList<Integer> stack;
        private Integer Min;
        private ArrayList<Integer> Mins;
        public MinStack1() {
            stack = new ArrayList<Integer>();
            Min = Integer.MAX_VALUE;
            Mins = new ArrayList<Integer>();
        }

        public void push(int x) {
            if(x <= Min){
                Min = x;
                Mins.add(x);
            }
            stack.add(x);
        }

        public void pop() {

            if(stack.size() == 0){
                return;
            }
            int answer = stack.remove(stack.size()-1);
            int curMin = Mins.get(Mins.size() -1);
            if(curMin == answer){
                Mins.remove(Mins.size()-1);
                if(Mins.size() -1 >= 0){
                    Min = Mins.get(Mins.size()-1);
                }else{
                    if(stack.size() == 0){
                        return;
                    }
                    Min = stack.get(stack.size()-1);
                }
            }
        }

        public int top() {
            if(stack.size() == 0){
                return 0;
            }
            return stack.get(stack.size()-1);
        }

        public int getMin() {
            return Min;

        }
    }

}
