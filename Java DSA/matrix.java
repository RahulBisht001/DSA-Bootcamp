import java.util.ArrayList;

public class matrix {
    public static void main(String[] args) {
        int matrix[][] = { { 45, 48, 54 },
                { 21, 89, 87 },
                { 70, 78, 15 } };
        snakePattern(matrix);

    }

    public static void snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        int n = matrix.length;
        int i = 0, j = 0;
        int x = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                arr.add(matrix[i][j]);
                System.out.println(arr.get(x));
                x++;
            }
            i++;
            if (i < n) {
                for (j = n - 1; j >= 0; j--) {
                    arr.add(matrix[i][j]);
                    System.out.println(arr.get(x));
                    x++;
                }
            }
        }

    }
}
