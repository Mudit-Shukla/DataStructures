package graphs;/*   Created by IntelliJ IDEA.
 *   Author: Mudit Shukla
 *   Date: 02-06-2021
 *   Time: 03:06
 *   File: graphs.Main.java
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int vertices = scanner.nextInt();
        System.out.println("Enter number of edges");
        int edges = scanner.nextInt();
        Graph graph = new Graph(vertices);
        for(int i =0; i< edges; i++){
            graph.addEdge(scanner.nextInt(),scanner.nextInt());
        }

//        graph.breadthFirstSearch(scanner.nextInt(), scanner.nextInt());
//        graph.depthFirstSearch(scanner.nextInt(), scanner.nextInt());
          graph.dfsUsingStack(scanner.nextInt(), scanner.nextInt());
    }
}
