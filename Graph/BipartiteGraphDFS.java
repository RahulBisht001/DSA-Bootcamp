// Check For Bipartite Graph Using DFS
class Solution
{
    public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>adj)
    {
        int[] color = new int[v];
        for(int i=0;i<v;++i)
            color[i] = -1;
            
        for(int i =0 ;i< v;++i){
            if(color[i] == -1){
                if(BipartiteDFS(i,0,color,adj) == false)
                    return false;
            }
        }    
        return true;
    }
    
    public boolean BipartiteDFS(int node,int col,int[]color,
        ArrayList<ArrayList<Integer>>adj){
        
        color[node] = col;
        
        for(Integer idx : adj.get(node)){
            if(color[idx] == -1){
                if(BipartiteDFS(idx,1-col,color,adj)== false)
                    return false;
            }
            else if(color[node] == color[idx])
                return false;
        }
        return true;
    }
}
