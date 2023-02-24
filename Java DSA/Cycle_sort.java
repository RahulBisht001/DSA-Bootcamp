import java.util.Arrays;

public class Cycle_sort {
    public static void main(String[] args) {
        // Code
        /*
         * When ever there is Numbers in range of 1 to n
         * use Cycle sort
         * 
         * Let Array [ 3 5 1 4 2]
         * Worst case swaps = n-1 swaps
         * Principle of Code : check swip move
         * 
         */
        int[] arr = { -1, 1, 0, -2, 2, 3, -3 };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            // Main Crusks is stablishing this relation for particular Range
            int correct = arr[i] + 3;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
