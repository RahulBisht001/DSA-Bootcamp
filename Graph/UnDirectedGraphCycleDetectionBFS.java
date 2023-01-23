
class Solution {
    public boolean isCycle 
        (int v, ArrayList<ArrayList<Integer>> adj) {
        
        return checkForCycle(v,adj);
    }
    
   
 public boolean checkForCycle(int v , ArrayList<ArrayList<Integer>>adj){
        boolean[] visited = new boolean[v];
        
        Queue<int[]>q = new LinkedList<>();
        for(int i= 0; i < v;++i){
            if(visited[i]== false){
            
            visited[i] = true;
            q.add(new int[]{ i ,-1});
            while (!q.isEmpty()) {
                int node = q.peek()[0];
                int parent = q.peek()[1];
                
                q.remove();
                for (Integer idx : adj.get(node)) {
                   if(visited[idx] == false) {
                    visited[idx] = true;
                    q.add(new int[] { idx, node });
                   }else if (parent != idx)
                    return true;
                }  
            }
            }
        }
        return false;
    }
}
