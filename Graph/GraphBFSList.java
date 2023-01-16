import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSList {
    // BFS Traversal

    // Via Adjacency List
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int d) {
        /*
         * s denotes source and d denotes destination
         * a utility function to add an edge in an
         * undirected graph
         */
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    public static ArrayList<Integer> BFS(int v, ArrayList<ArrayList<Integer>> adj) {

        ArrayList<Integer> bfsTraversal = new ArrayList<>(v);
        boolean visited[] = new boolean[v + 1];

        for (int i = 0; i < v; i++) {

            if (visited[i] == false) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {

                    Integer vertex = q.remove();
                    bfsTraversal.add(vertex);

                    for (Integer idx : adj.get(vertex)) {
                        if (visited[idx] == false) {
                            visited[idx] = true;
                            q.add(idx);
                        }
                    }
                }
            }
        }
        return bfsTraversal;
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        addEdge(adj, 0, 2);
        addEdge(adj, 0, 5);
        addEdge(adj, 1, 5);
        addEdge(adj, 3, 5);
        addEdge(adj, 3, 4);
        addEdge(adj, 4, 2);

        // BFS(v, adj);
        System.out.println(BFS(v, adj).toString());
    }
}
