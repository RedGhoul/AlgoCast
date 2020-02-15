package com.AlgoExpert.Code;

public class FindTheClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {
        return others(tree, target, Double.MAX_VALUE);
    }

    public static int others(BST tree, int target, double closest){
        if(tree == null){
            return (int) closest;
        }
        if(Math.abs(tree.value-target)< Math.abs(closest-target)){
            closest = tree.value;
        }

        if(target < tree.value ){
            return others(tree.left,target,closest);
        }else if(target > tree.value){
            return others(tree.right,target,closest);
        }else{
            return (int)closest;
        }
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
