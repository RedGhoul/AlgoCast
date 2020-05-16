package com.AlgoExpert.problems;
import java.util.*;

public class MinMaxStack {
    ArrayList<Integer> stack;
    ArrayList<HashMap<String,Integer>> iMinMax;

    public MinMaxStack(){
        stack = new ArrayList<Integer>();
        iMinMax = new ArrayList<HashMap<String,Integer>>();
    }

    public int peek() {
        return stack.get(stack.size()-1);
    }

    public int pop() {
        iMinMax.remove(iMinMax.size() -1);
        return stack.remove(stack.size()-1);
    }

    public void push(Integer number) {
        HashMap<String,Integer> currentMinMax = new HashMap<String,Integer>();

        if(stack.size() > 0){
            HashMap<String,Integer> prevMinMax = iMinMax.get(iMinMax.size()-1);
            currentMinMax.put("min", Math.min(prevMinMax.get("min"),number));
            currentMinMax.put("max", Math.max(prevMinMax.get("max"),number));
        }else{
            currentMinMax.put("min",number);
            currentMinMax.put("max",number);
        }

        iMinMax.add(currentMinMax);
        stack.add(number);
    }

    public int getMin() {
        HashMap<String,Integer> currentMinMax = iMinMax.get(iMinMax.size()-1);
        return currentMinMax.get("min");
    }

    public int getMax() {
        HashMap<String,Integer> currentMinMax = iMinMax.get(iMinMax.size()-1);
        return currentMinMax.get("max");
    }
}