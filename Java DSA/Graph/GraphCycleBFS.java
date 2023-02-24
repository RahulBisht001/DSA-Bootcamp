// Detect Cycle in an Undirected Graph Using BFS

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphCycleBFS {
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int d) {
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

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

    public static boolean checkForCycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[src] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { src, -1 });

        while (!q.isEmpty()) {
            int node = q.peek()[0];
            int parent = q.peek()[1];
            q.remove();

            for (Integer idx : adj.get(node)) {
                if (visited[idx] == false) {
                    visited[idx] = true;
                    q.add(new int[] { idx, node });
                } else if (parent != idx)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Creating a graph with 5 vertices
        int v = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        // Creating respective Vertices List inside the adjacency List
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        // Adding the edges between different different vertices
        // Adding edges one by one
        // addEdge(adj, 0, 1);
        // addEdge(adj, 1, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);
        // addEdge(adj, 3, 4);

        printGraph(adj);

        boolean[] visited = new boolean[v];
        int i = 0;
        for (i = 0; i < v; ++i) {
            if (visited[i] == false) {
                if (checkForCycle(i, v, adj, visited)) {
                    System.out.println("TRUE");
                    break;
                }
            }
        }
        if (i == v) {
            System.out.println("False");
        }
    }

}