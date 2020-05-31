package com.JavaAlgos;

import java.util.ArrayList;

public class StackImplementation {
    public static void main(String[] args){

    }

    private ArrayList<Integer> arrayList;

    public StackImplementation(){
        arrayList = new ArrayList<Integer>();
    }

    public void push(Integer item){
        if(item == null) return;
        arrayList.add(item);
    }
    public Integer pop(){
        if(arrayList.size() == 0) return null;
        Integer temp = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return temp;
    }
    public Integer peek(){
        if(arrayList.size() == 0) return null;
        return arrayList.get(arrayList.size()-1);
    }
}
