import java.util.ArrayList;

public class Recursion_PathInTheMaze {
    public static void main(String[] args) {
        /*
         * int totalPaths = path(3, 3);
         * System.out.println(totalPaths);
         * printPath(3, 3, "");
         * ArrayList<String> res = new ArrayList<>();
         * pathArr(3, 3, "", res);
         * System.out.println(res.toString());
         */

        // printPathDiagonal(3, 3, "");
    }

    public static int path(int row, int col) {

        if (row == 1 || col == 1)
            return 1;
        return path(row - 1, col) + path(row, col - 1);
    }

    // Print all The paths to reach the target
    public static void printPath(int row, int col, String processed) {

        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1) {
            printPath(row - 1, col, processed + "D");
        }
        if (col > 1) {
            printPath(row, col - 1, processed + "R");
        }

    }

    // Add all paths in the arraylist to reach the target
    public static void pathArr(int row, int col, String processed, ArrayList<String> res) {

        if (row == 1 && col == 1) {
            res.add(processed);
            return;
        }

        if (row > 1) {
            pathArr(row - 1, col, processed + "D", res);
        }
        if (col > 1) {
            pathArr(row, col - 1, processed + "R", res);
        }
    }

    // All paths to reach the target considering diagonal path as well
    public static void printPathDiagonal(int row, int col, String processed) {

        if (row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if (row > 1 && col > 1) {
            printPathDiagonal(row - 1, col - 1, processed + "d");
        }
        if (row > 1) {
            printPathDiagonal(row - 1, col, processed + "D");
        }
        if (col > 1) {
            printPathDiagonal(row, col - 1, processed + "R");
        }

    }
}
