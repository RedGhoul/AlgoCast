package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class BreathFirstSearch {


    static class Node {
        String name;
        List<Node> children = new ArrayList<Node>();

        public Node(String name) {
            this.name = name;
        }

        public List<String> breadthFirstSearch(List<String> array) {
            if(array == null){
                array = new ArrayList<String>();
            }
            array.add(this.name);
            return BFSHelper(this.children,array);
        }

        /*
        * Could Have Also done this iteratively
        *
        * TIME: O(V+E)
        * SPACE: O(V)
        * */
        public static List<String> BFSHelper(List<Node> nodes,List<String> names){
            if(nodes.size() == 0){
                return names;
            }
            Node currentNode = nodes.remove(0);
            names.add(currentNode.name);
            for(Node x : currentNode.children){
                nodes.add(x);
            }
            return BFSHelper(nodes,names);
        }

        public Node addChild(String name) {
            Node child = new Node(name);
            children.add(child);
            return this;
        }
    }
}
