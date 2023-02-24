import java.util.ArrayList;

public class GraphCycleDFS {
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int d) {
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

    public static boolean checkCycleDFS(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

        visited[node] = true;

        for (Integer idx : adj.get(node)) {
            if (visited[idx] == false) {
                if (checkCycleDFS(idx, node, adj, visited) == true) {
                    return true;
                }
            } else if (idx != parent)
                return true;
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
        // addEdge(adj, 2, 4);

        printGraph(adj);

        boolean[] visited = new boolean[v];
        int i = 0;
        for (i = 0; i < v; ++i) {
            if (visited[i] == false) {
                if (checkCycleDFS(i, -1, adj, visited)) {
                    System.out.println("True");
                    break;
                }
            }
        }
        if (i == v) {
            System.out.println("False");
        }
    }
}
