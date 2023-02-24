// Implementation of Graph Using Adjacency List

import java.util.ArrayList;

public class GraphAdjList {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int d) {
        /*
         * s denotes source and d denotes destination
         * a utility function to add an edge in an
         * undirected graph
         */
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    /*
     * utility function to print the adjacency list
     * representation of graph
     */
    static void printGraph(ArrayList<ArrayList<Integer>> adj) {

        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nAdjacency List of Vertex : " + i);
            System.out.print("head");

            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print("-> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        int v = 5;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        // Creating respective Vertices List inside the adjacency List
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding the edges between different different vertices
        // Adding edges one by one
        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);

        printGraph(adj);
    }
}
