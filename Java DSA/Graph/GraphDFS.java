import java.util.ArrayList;

public class GraphDFS {

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int s, int d) {
        /*
         * s denotes source and d denotes destination
         * a utility function to add an edge in an
         * undirected graph
         */
        adj.get(s).add(d);
        adj.get(d).add(s);
    }

    public static void DFS(int vertex, boolean[] visited, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans) {
        ans.add(vertex);
        visited[vertex] = true;
        for (Integer it : adj.get(vertex)) {
            if (visited[it] == false) {
                DFS(it, visited, adj, ans);
            }
        }
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

        ArrayList<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[v + 1];
        for (int i = 0; i < v; i++) {

            if (visited[i] == false) {
                DFS(i, visited, adj, ans);
            }
        }

        System.out.println(ans.toString());
    }
}
