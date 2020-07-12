package com.JavaAlgos.StephenGrider;

import java.util.ArrayList;

public class TreeNodeImplementation {
    public String data;
    public ArrayList<TreeNodeImplementation> childern;
    TreeNodeImplementation(String data){
        this.data = data;
        this.childern = new ArrayList<TreeNodeImplementation>();
    }

    public void Add(TreeNodeImplementation node){
        this.childern.add(node);
    }

    public void Remove(String data){
        for(int i =0; i < this.childern.size(); i++){
            if(this.childern.get(i).data.equals(data)){
                this.childern.remove(i);
            }
        }
    }
}
