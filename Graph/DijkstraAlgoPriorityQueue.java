/*
### Time Complexity : E*(Log V)
where E is The number of Edges in the Graph and V is Number of Vertex
*/
class Solution
{
   static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int s)
    {
       PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        int[] distance = new int[v];

        for (int i = 0; i < v; ++i)
            distance[i] = Integer.MAX_VALUE;

        distance[s] = 0;
        pq.add(new int[] { 0, s });

        while (!pq.isEmpty()) {
            int dis = pq.peek()[0];
            int node = pq.peek()[1];
            pq.remove();

            for (int i = 0; i < adj.get(node).size(); ++i) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if (dis + edgeWeight < distance[adjNode]) {
                    distance[adjNode] = dis + edgeWeight;
                    pq.add(new int[] { distance[adjNode], adjNode });
                }
            }
        }

        return distance;
    }
}
