
public class Backtracking {
    public static void main(String[] args) {

        boolean[][] maze = { { true, true, true }, { true, true, true }, { true, true, true } };

        AllDirections(0, 0, maze, "");
    }

    public static void AllDirections(int row, int col, boolean[][] maze, String processed) {

        if (row == maze.length - 1 && col == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }
        if (!maze[row][col])
            return;
        // I am Considering this Cell in My Block That's Why mark it as False
        maze[row][col] = false;
        // Down path
        if (row < maze.length - 1) {
            AllDirections(row + 1, col, maze, processed + "D");
        }
        // Right Path
        if (col < maze[0].length - 1) {
            AllDirections(row, col + 1, maze, processed + "R");
        }
        if (row > 0) {
            AllDirections(row - 1, col, maze, processed + "U");
        }
        if (col > 0) {
            AllDirections(row, col - 1, maze, processed + "L");
        }

        /*
         * This is The Line Where Function is Over and
         * so before the function get removed From the Stack
         * remove all the Previous Changes that were made
         */
        maze[row][col] = true;
    }
}
