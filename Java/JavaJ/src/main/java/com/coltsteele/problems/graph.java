package com.coltsteele.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class graph {
    public static void main(String[] args){
        graph newG = new graph();
        newG.addEdge("A","B");
        newG.addEdge("A","C");
        newG.addEdge("B","D");
        newG.addEdge("C","E");
        newG.addEdge("D","E");
        newG.addEdge("D","F");
        newG.addEdge("E","F");
        //newG.preformDFS("A",null);
        ArrayList<String> children = new ArrayList<>();
        children.add("A");
        HashMap<String, Boolean> visited = new HashMap<>();
        newG.preformBFS(children,visited);
    }

    public void preformDFS(String vertex, HashMap<String,Boolean> visited){
        if(vertex == null){
            return;
        }
        if(visited == null){
            visited = new HashMap<>();
        }
        System.out.println(vertex);
        visited.put(vertex, true);
        ArrayList<String> currentChildern = this.adjacencyList.get(vertex);
        for(String curV: currentChildern){
            boolean existsInHash = visited.containsKey(curV);
            if(!existsInHash){
                preformDFS(curV,visited);
            }
        }
    }

    public void preformBFS(ArrayList<String> children,HashMap<String, Boolean> visited){
        if(children.size() == 0){
            return;
        }

        String currentVertex = children.remove(0);
        if(!visited.containsKey(currentVertex)){
            System.out.println(currentVertex);
        }
        visited.put(currentVertex,true);



        ArrayList<String> newChildern = this.adjacencyList.get(currentVertex);

        for(int i =0; i < newChildern.size(); i++){
            if(!visited.containsKey(newChildern.get(i))){
                children.add(newChildern.get(i));
            }
        }

        preformBFS(children,visited);
    }
    HashMap<String, ArrayList<String>> adjacencyList;
    public graph(){
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertexName){
        if(this.adjacencyList.containsKey(vertexName)){
            return;
        }else{
            this.adjacencyList.put(vertexName, new ArrayList<String>());
        }
    }

    public void addEdge(String vertex1, String vertex2){
        addVertex(vertex1);
        addVertex(vertex2);

        ArrayList<String> temp = this.adjacencyList.get(vertex1);
        temp.add(vertex2);
        this.adjacencyList.put(vertex1,temp);

        temp = this.adjacencyList.get(vertex2);
        temp.add(vertex1);
        this.adjacencyList.put(vertex2,temp);
    }

    public void removeEdge(String vertex1, String vertex2){
        ArrayList<String> temp1 = this.adjacencyList.get(vertex1);
        ArrayList<String> temp2 = this.adjacencyList.get(vertex2);

        temp1.remove(vertex2);
        this.adjacencyList.put(vertex1,temp1);

        temp2.remove(vertex1);
        this.adjacencyList.put(vertex2,temp2);
    }

    public void removeVertex(String vertex){
        this.adjacencyList.remove(vertex);

        for(Map.Entry<String,ArrayList<String>> obj:this.adjacencyList.entrySet()){
            obj.getValue().remove(vertex);
        }
    }
}
