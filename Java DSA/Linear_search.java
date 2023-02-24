public class Linear_search {
    // Code
    public static void main(String[] args) {
        int nums[] = { 8, 19, 4, 2, 15, 3 };
        int original = 2;
        // System.out.println("Hi");

        for (int i = 0; i < nums.length; i++) {
            // System.out.println("Hi");

            if (nums[i] == original) {
                System.out.println(original + "  ");
                original *= 2;
            }
        }

        // big O(N) worst case complexity.
        // int[] arr = { -2, 0, 10, -19, 4, 6, -8 };
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr.length; j++) {
        // if (arr[j] == (2 * arr[i])) {
        // System.out.println("True");
        // System.out.println(i + " " + j);
        // }
        // }
        // }
        // System.out.println("False");
    }

}
