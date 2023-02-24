import java.util.ArrayList;

public class Insertion_sort {
    public static void main(String[] args) {
        // code
        // int[] arr = { 56, 97, 18, 9, 10 };
        // int n = arr.length;
        // for (int i = 1; i < n; i++) {
        // int key = arr[i];
        // int j = i - 1;
        // /*
        // * Move elements of arr[0..i-1], that are
        // * greater than key, to one position ahead
        // * of their current position
        // */
        // while (j >= 0 && arr[j] > key) {
        // arr[j + 1] = arr[j];
        // j = j - 1;
        // }
        // arr[j + 1] = key;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(arr[i] + " ");
        // }

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        if (arr.contains(2)) {
            arr.remove(Integer.valueOf(2));
        }
        arr.remove(Integer.valueOf(2));

        System.out.println();
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

    }
}
