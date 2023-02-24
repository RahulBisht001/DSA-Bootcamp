public class Ques {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 1 },
                { 0, 0, 1 }, { 0, 0, 1 }, { 0, 1, 1 }, { 1, 1, 1 } };

        int x = rowWithMax1s(arr, 5, 3);
        System.out.println(x);

    }

    public static int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = binarySearch(arr[i], m);
        }
        int max = a[0];
        int index = 0;
        for (int j = 1; j < n; j++) {
            if (a[j] > max) {
                max = a[j];
                index = j;
            }
        }
        for (int k = 0; k < n; k++) {
            System.out.print(a[k] + " ");
            System.out.println();
        }
        return index;
    }

    public static int binarySearch(int[] arr, int m) {
        int start = 0, end = m - 1;
        int count = 0;
        // if (arr[0] == 1) {
        // return m;
        // } else if (arr[m - 1] == 0) {
        // return 0;
        // }

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == 1 && end >= 0) {
                end = mid - 1;
                count = mid;
            } else if (arr[mid] == 0 && start <= m - 1) {
                start = mid + 1;
                count = mid;
            }
        }

        return count + 1;
    }

}
