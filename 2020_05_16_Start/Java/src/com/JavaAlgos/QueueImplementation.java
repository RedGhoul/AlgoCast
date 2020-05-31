package com.JavaAlgos;

import java.util.ArrayList;

public class QueueImplementation {
//    public static void main(String[] args){
//        QueueImplementation temp = new QueueImplementation();
//        temp.add(1);
//        temp.add(2);
//        temp.add(3);
//        temp.add(4);
//        System.out.println(temp.remove());
//    }
    private ArrayList<Integer> arrayList;
    public QueueImplementation(){
        arrayList = new ArrayList<>();
    }

    public void add(int item){
        arrayList.add(0,item);
    }

    public Integer remove(){
        if(arrayList.size() == 0) return null;
        Integer returnInt = arrayList.get(arrayList.size()-1);
        arrayList.remove(arrayList.size()-1);
        return returnInt;
    }
}
