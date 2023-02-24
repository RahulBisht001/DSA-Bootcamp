public class LeastGreaterBSearch {
    public static void main(String[] args) {
        int a[] = { 12, 13, 13, 14, 16, 16 };
        int key = 11;
        int n = a.length;
        int ans = LeastGreat(a, 0, n - 1, key);
        System.out.println("The Least Greateste elements of " + key + " is : " + ans);
    }

    static int LeastGreat(int[] a, int low, int high, int key) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low + 1) / 2;
            int midVal = a[mid];

            if (midVal < key) {

                // If mid is less than key, all elements
                // in range [low, mid - 1] are <= key
                // then we search in right side of mid
                // so we now search in [mid + 1, high]
                low = mid + 1;
            } else if (midVal > key) {

                // If mid is greater than key, all elements
                // in range [mid + 1, high] are >= key
                // we note down the last found index, then
                // we search in left side of mid
                // so we now search in [low, mid - 1]
                ans = mid;
                high = mid - 1;
            } else if (midVal == key) {

                // If mid is equal to key, all elements in
                // range [low, mid] are <= key
                // so we now search in [mid + 1, high]
                low = mid + 1;
            }
        }
        return a[ans];
    }

}
