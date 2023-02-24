import java.util.Arrays;
//import java.util.Scanner;

public class array_2D {
    public static void main(String[] args) {
        // code
        // int[][] a = { { 1, 2, 3, 4 }, { 5, 8 }, { 9, 0, 11 } };
        // int i, j, big;
        // big = a[0][0];
        // for (i = 0; i < a.length; i++) {

        // for (j = 0; j < a[i].length; j++) {
        // if (a[i][j] > big) {
        // big = a[i][j];
        // }
        // }
        // }

        // // for (int k = 0; k < a.length; k++) {
        // // System.out.print(Arrays.toString(a[k]));
        // // System.out.println();
        // // }
        // int[] arr = { 1, 2, 3, 4, 5 };
        // // for Each loop for printing every element of 2-D array

        // System.out.print(Arrays.toString(arr));

        // System.out.println();
        // // For each loop for printing 1-D array of 2-D array
        // // for (int[] arr : a) {
        // // System.out.print(Arrays.toString(arr));
        // // System.out.println();

        // // }
        // // System.out.print(Arrays.toString(a[i]));
        // // System.out.println("The Biggest element of the matrix is" + " " + big);
        // int[][] a = new int[3][3];
        // try (Scanner sc = new Scanner(System.in)) {
        // for (int i = 0; i < a.length; i++) {
        // for (int j = 0; j < a[i].length; j++) {
        // a[i][j] = sc.nextInt();
        // }
        // }
        // }

        int[][] d;
        // d={{1,2,3},{1,2}};
        d = get_array();
        for (int[] arr : d) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[][] get_array() {
        return null;
    }
}
