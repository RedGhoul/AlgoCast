package com.JavaAlgos;

public class TreeNodeImpl {
    public static void main(String[] args){
        TreeNodeImpl root = new TreeNodeImpl(10);
        TreeNodeImpl root_left = new TreeNodeImpl(0);
        TreeNodeImpl root_right = new TreeNodeImpl(12);
        TreeNodeImpl left1 = new TreeNodeImpl(-1);
        TreeNodeImpl right1 = new TreeNodeImpl(4);

        root.left = root_left;
        root.right = root_right;

        root_left.left = left1;
        root_right.right = right1;

        root.insert(-20);

    }
    public int data;
    public TreeNodeImpl left;
    public TreeNodeImpl right;
    public TreeNodeImpl(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(int InputData){
        if(InputData >= this.data){ // handled the equals case here
            if(this.right != null){
                this.right.insert(InputData);
            }else{
                this.right = new TreeNodeImpl(InputData);
            }
        }else{
            if(this.left != null){
                this.left.insert(InputData);
            }else{
                this.left = new TreeNodeImpl(InputData);
            }
        }
        return;
    }


}
