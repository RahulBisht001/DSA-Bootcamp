// Prim's Algorithm 

// Using Priority Queue

class Solution{
	static int spanningTree(int V, int E, int edges[][]){
	   
	    ArrayList<ArrayList<int[]>>adj = new ArrayList<>();
	    for(int i =0; i<V;++i)
	        adj.add(new ArrayList<>());
	        
	    for(int i=0;i < E;++i){
	        adj.get(edges[i][0]).add(new int[]{edges[i][1], edges[i][2]});
	        adj.get(edges[i][1]).add(new int[]{edges[i][0], edges[i][2]});
	    }
	    int[] visited = new int[V];
	    int total = 0;
	    
	    PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
	    pq.add(new int[]{0,0});
	    
	    while(!pq.isEmpty()){
	        int node = pq.peek()[0];
	        int weight = pq.peek()[1];
	        pq.remove();
	        
	        if(visited[node] == 1) continue;
	        visited[node] = 1;
	        total += weight;
	        
	        for(int[]a: adj.get(node)){
	            int adjNode = a[0];
	            int edw = a[1];
	            if(visited[adjNode]== 0){
	                pq.add(new int[]{adjNode, edw});
	            }
	        }
	    }
	    return total;
	}
}
