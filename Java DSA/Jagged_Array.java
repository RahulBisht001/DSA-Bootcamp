import java.util.Scanner;
import java.util.Arrays;

public class Jagged_Array {
    public static void main(String[] args) {
        // // code
        // int arr[][] = { { 1, 2, 3 }, { 2, 3, 4, 5 }, { 4, 6 } };
        // System.out.println("Length =" + arr.length);
        int[][] arr = new int[3][];
        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
        }

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }

}
