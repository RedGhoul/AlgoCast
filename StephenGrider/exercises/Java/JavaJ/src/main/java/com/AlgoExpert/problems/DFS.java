package com.AlgoExpert.Code;

import java.util.ArrayList;
import java.util.List;

public class DFS {


        public static void main(String[] args){
            Node test1 = new DFS.Node("A");
            test1.addChild("B").addChild("C");
            test1.children.get(0).addChild("D");

            List<String> inputArray= new ArrayList<String>();
            //inputArray = test1.depthFirstSearch(inputArray);
            System.out.println(inputArray);

            inputArray = test1.depthFirstSearchF(inputArray);
            System.out.println(inputArray);

        }
        // Do not edit the class below except
        // for the depthFirstSearch method.
        // Feel free to add new properties
        // and methods to the class.
        static class Node {
            String name;
            List<Node> children = new ArrayList<Node>();

            public Node(String name) {
                this.name = name;
            }

            // space how ever many nodes there are
            // time - number of nodes
            public List<String> depthFirstSearch(List<String> array) {
                List<Node> nodeArr = new ArrayList<Node>();
                nodeArr.add(this);
                List<String> nameArr = new ArrayList<String>();
                return Node.DfsHelper(nameArr,nodeArr);
            }

            /*
            * TIME: O(V+E)
            * SPACE: O(V)
            * */
            public static List<String> DfsHelper(List<String> nameArr,List<Node> nodeArr){
                if(nodeArr.size() == 0){
                    return nameArr;
                }
                Node currentNode = nodeArr.remove(0);
                nameArr.add(currentNode.name);

                if(currentNode.children.size() != 0){
                    /*
                     * This really makes me miss JS unshift and spread I love you
                     *
                     * // Another way to do it
                     * List<String> newList = Stream.concat(listOne.stream(), listTwo.stream())
                             .collect(Collectors.toList());
                     * */
                    currentNode.children.addAll(nodeArr); // adding the stuff to the very end so you
                    // have it where the new things are all the beginning, and the old stuff is added at the end
                    nodeArr = currentNode.children; // so now you take that array which happens to the be the childern
                    // of the current node and you set it equal to the current Node Array
                }

                return Node.DfsHelper(nameArr,nodeArr);
            }

            // O(V + e) time | O(v) space
            public List<String> depthFirstSearchF(List<String> array){
                array.add(this.name);
                for(int i =0; i < children.size(); i++){ // your getting its children here
                    children.get(i).depthFirstSearchF(array); // then you call dfs on that child
                }
                return array; // its okay that you returned that array
                // you just end up unraveling the stack
            }

            public Node addChild(String name) {
                Node child = new Node(name);
                children.add(child);
                return this;
            }
        }


}
