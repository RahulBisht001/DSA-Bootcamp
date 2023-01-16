public class GraphAdjMatrix {

    int vertex;
    int[][] matrix;

    // Constructor
    public GraphAdjMatrix(int vertex) {
        this.vertex = vertex;
        matrix = new int[vertex][vertex];
    }

    public void addEdge(int s, int d) {
        matrix[s][d] = 1;
        matrix[d][s] = 1;
    }

    public void printGraph() {
        System.out.println("Adjacency Matrix :");

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjMatrix adj = new GraphAdjMatrix(4);
        adj.addEdge(0, 1);
        // 0 as the array is 0-indexed
        adj.addEdge(1, 2);
        adj.addEdge(2, 3);
        adj.printGraph();
    }
}
