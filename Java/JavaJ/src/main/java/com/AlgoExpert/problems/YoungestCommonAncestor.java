package com.AlgoExpert.problems;

public class YoungestCommonAncestor {
    public static AncestralTree getYoungestCommonAncestor(AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
        int D1 = depthFinder(topAncestor, descendantOne);
        int D2 = depthFinder(topAncestor, descendantTwo);
        int levelInc = Math.abs(D1-D2);
        if(D1 > D2){
            // Should put this stuff into its own function
            for(int i = 0; i < levelInc; i++){
                descendantOne = descendantOne.ancestor;
            }
            while(descendantOne != descendantTwo){
                descendantOne = descendantOne.ancestor;
                descendantTwo = descendantTwo.ancestor;
            }
            return descendantOne;
        }else{
            for(int i = 0; i < levelInc; i++){
                descendantTwo = descendantTwo.ancestor;
            }
            while(descendantOne != descendantTwo){
                descendantOne = descendantOne.ancestor;
                descendantTwo = descendantTwo.ancestor;
            }
            return descendantOne;
        }
    }

    public static int depthFinder(AncestralTree root,AncestralTree current){
        int count = 0;
        while(current != root){
            count++;
            current = current.ancestor;
        }
        return count;
    }
    static class AncestralTree {
        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }
    }

}
