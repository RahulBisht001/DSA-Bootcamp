import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFSMatrix {

    public static void addEdge(int[][] matrix, int s, int d) {
        matrix[s][d] = 1;
        matrix[d][s] = 1;
    }

    public static void printGraph(int vertex, int[][] matrix) {
        System.out.println("Adjacency Matrix :");

        for (int i = 0; i < vertex; i++) {
            for (int j = 0; j < vertex; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> BFS(int v, int matrix[][]) {
        ArrayList<Integer> traversal = new ArrayList<>();

        boolean visited[] = new boolean[v + 1];
        for (int i = 0; i < v; i++) {
            if (visited[i] == false) {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                visited[i] = true;

                while (!q.isEmpty()) {
                    int vertex = q.remove();
                    traversal.add(vertex);

                    for (int j = 0; j < v; j++) {
                        if (!visited[j] && matrix[vertex][j] == 1) {
                            q.add(j);
                            visited[j] = true;
                        }
                    }
                }
            }
        }
        return traversal;
    }

    public static void main(String[] args) {

        int vertex = 10;
        int[][] matrix = new int[vertex][vertex];

        addEdge(matrix, 9, 9);
        addEdge(matrix, 0, 2);
        addEdge(matrix, 0, 5);
        addEdge(matrix, 1, 5);
        addEdge(matrix, 1, 6);
        addEdge(matrix, 1, 8);
        addEdge(matrix, 3, 5);
        addEdge(matrix, 3, 4);
        addEdge(matrix, 4, 7);
        addEdge(matrix, 5, 7);

        // printGraph(vertex, matrix);
        System.out.println(BFS(vertex, matrix).toString());

    }
}
