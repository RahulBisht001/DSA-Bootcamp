// Check For Bipartite Graph using BFS
class Solution
{
    public boolean isBipartite(int v, ArrayList<ArrayList<Integer>>adj)
    {
        // 1. Linear Graph with No Cycle are
        //    Always Bipartite
        // 2. Any Graph with Even Cycle Length 
        //    can also be Bipaertite
        return checkBipartite(v, adj);
    }
    
    public boolean checkBipartite(int v, ArrayList<ArrayList<Integer>>adj){
        int[] color = new int[v];
        for(int i=0;i<v;++i)
            color[i] = -1;
            
        Queue<Integer>q = new LinkedList<>();   
        for(int i=0; i < v;++i){
            if(color[i] == -1){
                q.add(i);
                color[i] = 0;
                
                while(!q.isEmpty()){
                    int node = q.remove();
                    for(Integer idx: adj.get(node)){
                        if(color[idx] == -1){
                            color[idx] = 1 - color[node];
                            q.add(idx);
                        }
                        else if(color[idx] == color[node]) 
                            return false;
                    }
                }
            }
        }
        return true;
    }
}

