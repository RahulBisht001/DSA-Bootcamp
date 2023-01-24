class Solution {
    public boolean isCycle
        (int v, ArrayList<ArrayList<Integer>> adj) {
        
        boolean[] visited = new boolean[v];
        for(int i = 0; i < v; ++i) {
            if (visited[i] == false) {
                if (checkCycleDFS(i, -1, adj, visited))
                   return true;
            }
        }
        return false;
    }
    
    public  boolean checkCycleDFS(int node, int parent, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

       visited[node] = true;

        for (Integer idx : adj.get(node)) {
            if (visited[idx] == false) {
                if (checkCycleDFS(idx, node, adj, visited))
                    return true;
            } else if (idx != parent)
                return true;
        }
        return false;
    }
}
