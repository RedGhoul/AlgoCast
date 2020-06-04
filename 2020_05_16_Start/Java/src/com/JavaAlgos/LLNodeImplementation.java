package com.JavaAlgos;

public class LLNodeImplementation {
    public int data;
    public LLNodeImplementation nextNode;
    public LLNodeImplementation(int data, LLNodeImplementation next){
        this.data = data;
        this.nextNode = next;
    }
    public LLNodeImplementation(int data){
        this.data = data;
        this.nextNode = null;
    }
}
