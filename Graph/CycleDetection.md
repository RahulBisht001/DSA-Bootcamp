class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle
            (int v, ArrayList<ArrayList<Integer>> adj) {
        
        boolean visited[] = new boolean[v+1];
      
        for(int i=0;i<v;++i){
            if(visited[i]== false){
                if(dfs(i,adj,visited,-1)== true)
                       return true;
            } 
        }
        return false;
    }
    
    public boolean dfs(int vertex,ArrayList<ArrayList<Integer>>adj,
            boolean[] visited ,int parent ){
            visited[vertex]= true;  
           
           for(Integer it : adj.get(vertex)){
               if(visited[it]== false){
                   if(dfs(it,adj,visited,vertex)== true){
                       return true;
                   }
               }
               else if(parent != it){
                       return true;
               }
           }
        return false;
    }
}
