package com.AlgoExpert.Code;

import java.util.ArrayList;
import java.util.List;

public class DFS {


        public static void main(String[] args){
            Node test1 = new DFS.Node("A");
            test1.addChild("B").addChild("C");
            test1.children.get(0).addChild("D");

            List<String> inputArray= new ArrayList<String>();
            inputArray = test1.depthFirstSearch(inputArray);
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

            public List<String> depthFirstSearch(List<String> array) {
                List<Node> nodeArr = new ArrayList<Node>();
                nodeArr.add(this);
                List<String> nameArr = new ArrayList<String>();
                return Node.DfsHelper(nameArr,nodeArr);
            }

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
                    currentNode.children.addAll(nodeArr);
                    nodeArr = currentNode.children;
                }

                return Node.DfsHelper(nameArr,nodeArr);
            }

            public Node addChild(String name) {
                Node child = new Node(name);
                children.add(child);
                return this;
            }
        }


}
