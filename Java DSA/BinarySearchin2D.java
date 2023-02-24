import java.util.Arrays;

public class BinarySearchin2D {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 4, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int target = 10;
        System.out.println(Arrays.toString(binarySearchInMatrix(arr, target)));
    }

    static int[] binarySearch(int[][] mat, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;

            if (mat[row][mid] == target) {
                return new int[] { row, mid };

            } else if (mat[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }

        return new int[] { -1, -1 };

    }

    public static int[] binarySearchInMatrix(int[][] arr, int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        // Apply Simple Binary search on it
        if (rows == 1) {
            return binarySearch(arr, 0, 0, cols - 1, target);
        }

        /*
         * else reduce your search Space
         * first find the mid Column (we can do this via row also)
         * check where your target gonna lye
         * hence reduced search space using Binary Search
         */

        int rStart = 0;
        int rEnd = rows - 1;
        int midCol = (cols - 1) / 2;

        // run the loop util 2 rows are remaining
        while (rStart < rEnd - 1) {
            // while it is true we are left with 2 Rows
            // we need at least 2 rows .
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][midCol] == target) {
                return new int[] { mid, midCol };
            } else if (arr[mid][midCol] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }

        }

        // Now we are left with 2 Rows
        // Check whether the target is in the col of 2 rows
        if (arr[rStart][midCol] == target) {
            return new int[] { rStart, midCol };
        }
        if (arr[rStart + 1][midCol] == target) {
            return new int[] { rStart + 1, midCol };
        }

        // (int[][] mat, int row, int cStart, int cEnd, int target)
        // Otherwise
        // Search in First half
        if (arr[rStart][midCol - 1] >= target) {
            return binarySearch(arr, rStart, 0, midCol - 1, target);
        }

        // Search in Second half
        else if (target >= arr[rStart][midCol + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, midCol + 1, cols - 1, target);
        }

        // Search in Third half
        else if (arr[rStart + 1][midCol - 1] >= target) {
            return binarySearch(arr, rStart + 1, 0, midCol - 1, target);
        }

        // Search in Fourth half
        else {
            return binarySearch(arr, rStart + 1, midCol + 1, cols - 1, target);
        }

    }

}

/*
 * // Ques 2:
 * // Code for a row wise ans column wise sorted matrix
 * public static void search() {
 * int[][] arr = { { 1, 2, 3, 4 },
 * { 4, 6, 7, 8 },
 * { 9, 10, 11, 12 },
 * { 13, 14, 15, 16 } };
 * 
 * int r = 0;
 * int c = 3;
 * int target = 5;
 * while (r < 4 && c >= 0) {
 * if (target == arr[r][c]) {
 * System.out.println("Element Found at = " + r + " " + c);
 * break;
 * } else if (target < arr[r][c]) {
 * c--;
 * } else {
 * r++;
 * }
 * }
 * System.out.println("Element doesnt exixt");
 * 
 * }
 * 
 */

/*
 * public static void binarySearchInMatrix() {
 * 
 * int[][] arr = { { 1, 2, 3, 4 },
 * { 4, 6, 7, 8 },
 * { 9, 10, 11, 12 },
 * { 13, 14, 15, 16 } };
 * 
 * int r = 0;
 * int c = arr[0].length;
 * int target = 10;
 * while (r < arr.length) {
 * if (target == arr[r][0]) {
 * System.out.println("Element found at " + r + " " + c);
 * } else if (target == arr[r][c]) {
 * System.out.println("Element found at " + r + " " + c);
 * } else if (target > arr[r][0] && target < arr[r][c]) {
 * 
 * } else {
 * r++;
 * }
 * }
 * }
 */
