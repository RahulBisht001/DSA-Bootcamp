
// Exploring the Java Arrays class.
import java.util.Arrays;

public class Arrays_class {
    public static void main(String[] args) {
        // code
        int[] marks = { 1, 2, 3, 55, 31, 5, 33, 23 };

        // for each loop

        // Printg arrays by toString method
        System.out.println(Arrays.toString(marks));

        // Binary search
        int ix = Arrays.binarySearch(marks, 3);
        System.out.println("the Index is " + ix);

        // sort
        Arrays.sort(marks);
        for (int i : marks) {
            System.out.print(i + " ");
        }

        // fill Method
        Arrays.fill(marks, 10);
        for (int i : marks) {
            System.out.print(i + " ");
        }

        // copyOf method
        int[] new_arr = new int[15];
        new_arr = Arrays.copyOf(marks, 15);
        for (int i : new_arr) {
            System.out.print(i + " ");
        }
    }

}
