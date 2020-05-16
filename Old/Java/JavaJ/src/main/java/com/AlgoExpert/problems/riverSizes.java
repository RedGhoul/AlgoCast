package com.AlgoExpert.problems;

import java.util.ArrayList;
import java.util.List;

public class riverSizes {
    public static ArrayList<Integer> riverSizes(int[][] matrix) {
        ArrayList<Integer> sizes = new ArrayList<Integer>();
        //matrix.length gives you number of rows
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for( int i =0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(visited[i][j]){
                    continue;
                }
                traverseNode(i, j, matrix,visited,sizes);
            }
        }
        return sizes;
    }

    public static void traverseNode(int i, int j, int[][] matrix, boolean[][] visited, List<Integer> sizes){
        int currentRiverSize = 0;
        List<Integer[]> nodesToExplore = new ArrayList<Integer[]>();
        nodesToExplore.add(new Integer[] {i, j});
        while(!nodesToExplore.isEmpty()){ // keep going with this cycle till you have nothing else to explore
            Integer[] currentNode = nodesToExplore.get(nodesToExplore.size() -1);
            nodesToExplore.remove(nodesToExplore.size()-1);
            i = currentNode[0];
            j = currentNode[1];
            if(visited[i][j]){
                continue;
            }
            visited[i][j] = true;
            if(matrix[i][j] == 0){
                continue;
            }
            currentRiverSize++;
            // Using getUnivistedNeighbors to get all your children
            List<Integer[]> unvistedNeighbors = getUnivistedNeighbors(i,j,matrix,visited);
            for(Integer[] neighbour: unvistedNeighbors){
                nodesToExplore.add(neighbour);
            }
        }
        if(currentRiverSize > 0){ // in the end check to see how man nodes you hit
            sizes.add(currentRiverSize);
        }
    }

    public static List<Integer[]> getUnivistedNeighbors(int i, int j, int[][] matrix, boolean[][] visited){
        List<Integer[]> unvisitedNeighbors = new ArrayList<Integer[]>();
        if(i > 0 && !visited[i -1][j]){
            unvisitedNeighbors.add(new Integer[] {i -1,j});
        }
        if(i < matrix.length - 1 && !visited[i +1][j]){
            unvisitedNeighbors.add(new Integer[] {i + 1,j});
        }
        if(j > 0 && !visited[i][j-1]){
            unvisitedNeighbors.add(new Integer[] {i, j-1});
        }
        if(j < matrix[0].length-1 && !visited[i][j+1]){
            unvisitedNeighbors.add(new Integer[] {i, j+1});
        }
        return unvisitedNeighbors;
    }
}
