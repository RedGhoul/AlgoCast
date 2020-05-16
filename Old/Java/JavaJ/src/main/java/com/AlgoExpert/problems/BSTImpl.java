package com.AlgoExpert.problems;

public class BSTImpl {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if(value > this.value){
                if(this.right != null){
                    this.right.insert(value);
                }else{
                    this.right = new BST(value);
                    return this;
                }
            }else if(value < this.value){
                if(this.left != null){
                    this.left.insert(value);
                }else{
                    this.left = new BST(value);
                    return this;
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if(value == this.value){
                return true;
            }else if(value > this.value){
                return this.right.contains(value);
            }else if(value < this.value){
                return this.left.contains(value);
            }
            return false;
        }

        public BST remove(int value) {
            removeHelper(value,null);
            return this;
        }
        public int getMinValue(){
            if(this.left == null){
                return this.value;
            }else{
                return this.getMinValue();
            }
        }
        public void removeHelper(int value, BST parent){
            if(value < this.value){
                if(left != null){
                    left.removeHelper(value,this);
                }
            }else if(value > this.value){
                if(right != null){
                    right.removeHelper(value,this);
                }
            } else {
                if(this.left != null && this.right != null){
                    this.value = this.right.getMinValue(); // took the smallest value to the left of the right node
                    this.right.removeHelper(this.value, this); // not have to delete it by removing it
                }else if(parent == null){
                    if(this.left != null){
                        this.value = left.value;
                        this.right = this.left.right;
                        this.left = this.left.left;
                    } else if(this.right != null){
                        this.value = right.value;
                        this.left = this.right.left;
                        this.right = this.right.right;
                    } else {
                        value = 0;
                    }
                } else if(parent.left == this){
                    if(this.left != null){
                        parent.left = this.left;
                    }else{
                        parent.left = this.right;
                    }
                }else if(parent.right == this){
                    if(this.left != null){
                        parent.right = this.left;
                    }else {
                        parent.right = this.right;
                    }
                }
            }
        }
    }
}
