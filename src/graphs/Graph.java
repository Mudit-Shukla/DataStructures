package graphs;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 02-06-2021
 *   Time: 03:06
 *   File: graphs.Graph.java
 */


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    private LinkedList<Integer> adjacencyList [];

    public Graph(int vertices){
        adjacencyList = new LinkedList[vertices];
        for(int i =0; i< vertices; i++)
            adjacencyList[i] = new LinkedList<Integer>();
    }

    public void addEdge(int source, int destination){
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source);
    }

    public void breadthFirstSearch(int source, int destination){
        boolean[] visitedVertices = new boolean[adjacencyList.length];
        int[] parent = new int[adjacencyList.length];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        parent[source] = -1;
        visitedVertices[source] = true;

        while (!queue.isEmpty()){
            int current = queue.poll();
            if(current == destination)
                break;
            for(int neighbour : adjacencyList[current]){
                if(!visitedVertices[neighbour]){
                    visitedVertices[neighbour] = true;
                    queue.add(neighbour);
                    parent[neighbour] = current;
                }
            }
        }

        int current = destination;
        while (parent[current] != -1){
            System.out.print(current + " -> ");
            current = parent[current];
        }
    }

    /**
     *  DFS based on recursive approach
     */

    private boolean depthFirstSearchHelper(int source, int destination, boolean[] visitedVertices){
        if(source == destination)
            return true;
        for(int neighbour : adjacencyList[source]){
            if(!visitedVertices[neighbour]){
                visitedVertices[neighbour] = true;
                boolean isConnected = depthFirstSearchHelper(neighbour, destination, visitedVertices);
                if(isConnected)
                    return true;
            }
        }

        return false;
    }

    public void  depthFirstSearch(int source, int destination){
        boolean[] visitedVertices = new boolean[adjacencyList.length];
        visitedVertices[source] = true;
        boolean result = depthFirstSearchHelper(source, destination, visitedVertices);
        if(result)
            System.out.println("Path is possible");
        else
            System.out.println("Path is not possible");
    }


    /**
     *      DFS based on using stack approach
     */

    public void dfsUsingStack(int source, int destination){
        boolean[] visitedVertices = new boolean[adjacencyList.length];
        Stack<Integer> stack = new Stack<>();
        stack.push(source);
        visitedVertices[source] = true;

        while(!stack.empty()) {
            int current = stack.peek();
            if (current == destination) {
                System.out.println("Path is possible");
                break;
            }
            stack.pop();
            for (int neighbour : adjacencyList[current]) {
                if (!visitedVertices[neighbour]) {
                    stack.push(neighbour);
                    visitedVertices[neighbour] = true;
                }
            }
        }
    }
}
