public class GreatestLeastBSearch {
    public static void main(String[] args) {
        int[] a = { 2, 2, 3, 4, 5, 5, 5, 5, 6, 6 };
        int key = 12;
        int n = a.length;
        int ans = greatestlesser(a, 0, n - 1, key);
        System.out.println("The Least Greateste elements of " + key + " is : " + ans);
    }

    static int greatestlesser(int[] a, int low, int high, int key) {
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low + 1) / 2;
            int midVal = a[mid];

            if (midVal < key) {

                // If mid is less than key, all elements
                // in range [low, mid - 1] are < key
                // we note down the last found index, then
                // we search in right side of mid
                // so we now search in [mid + 1, high]
                ans = mid;
                low = mid + 1;
            } else if (midVal > key) {

                // If mid is greater than key, all elements
                // in range [mid + 1, high] are > key
                // then we search in left side of mid
                // so we now search in [low, mid - 1]
                high = mid - 1;
            } else if (midVal == key) {

                // If mid is equal to key, all elements
                // in range [mid + 1, high] are >= key
                // then we search in left side of mid
                // so we now search in [low, mid - 1]
                high = mid - 1;
            }
        }

        return ans;
        // returning the index of that value which is least greatest for givan key
    }
}
