public class FirstOccurenceBSearch {
    public static void main(String[] args) {
        int arr[] = { 6, 6, 6, 6, 6, 6, 6 };
        int key = 6;
        int ans = First(arr, key);
        System.out.println("The First Occurence of " + key + " is : " + ans);
    }

    public static int First(int[] a, int key) {
        int low = 0;
        int ans = -1;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low + 1) / 2;
            int midVal = a[mid];

            if (midVal < key) {

                // If mid is less than key, all elements
                // in range [low, mid] are also less
                // so we now search in [mid + 1, high]
                low = mid + 1;
            } else if (midVal > key) {

                // If mid is greater than key, all elements
                // in range [mid + 1, high] are also greater
                // so we now search in [low, mid - 1]
                high = mid - 1;
            } else if (midVal == key) {

                // If mid is equal to key, we note down
                // the last found index then we search
                // for more in left side of mid
                // so we now search in [low, mid - 1]
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
