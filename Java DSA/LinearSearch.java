import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        // code

        int arr4[][] = { { 23, 4, 1 }, { 118, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };
        int ans = array_2DSearch(arr4);

        System.out.println("The Max Element is : " + ans);
        // int target = 9;
        // int[] ans5 = array_2DSearch(arr4, target);

        // System.out.println("The Element found at index : " + Arrays.toString(ans5));
        // int[] arr3 = { 18, 12, -7, 3, 14, 28 };
        // int arr3[] = {};
        // int ans4 = minimumNum(arr3);

        // System.out.println("The Minimum element is:" + ans4);
        // int arr2[] = { 18, 12, -7, 3, 14, 28 };
        // int target = 14;
        // int start = 1;
        // int end = 4;
        // int ans3 = searchInRange(arr2, target, start, end);
        // System.out.println("The Element found at :" + ans3);
        // String str = "Rahul Bisht";
        // char target = 'l';

        // boolean ans2 = searchString(str, target);
        // System.out.println("The Charaxtter Found in string :" + ans2);
        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // int target = 14;
        // int ans = linearSearch(arr, target);
        // System.out.println("The Element Found at " + ans);
    }

    public static int array_2DSearch(int[][] arr4) {

        if (arr4.length == 0) {
            System.out.println("Chutiya hai Kya");
            return Integer.MAX_VALUE;
        }

        int max = arr4[0][0];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i][j] > max) {
                    max = arr4[i][j];
                }
            }
        }
        return max;
    }

    public static int[] array_2DSearch(int[][] arr4, int target) {
        if (arr4.length == 0) {
            System.out.println("Chutiya hai Kya");
            return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE };
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (arr4[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE };
    }

    public static int minimumNum(int[] arr3) {
        if (arr3.length == 0) {
            System.out.println("Chutiya hai Kya");
            return Integer.MIN_VALUE;
        }
        Arrays.sort(arr3);

        return arr3[0];
    }

    public static int searchInRange(int[] arr2, int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (arr2[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static boolean searchString(String str, char target) {

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }
        return false;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
