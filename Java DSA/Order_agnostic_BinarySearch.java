public class Order_agnostic_BinarySearch {

    public static void main(String[] args) {
        // code
        int[] arr = { 111, 32, 23, 14, 5, 6, -6, -7, -8, -9, -10 };
        int target = 32;
        int result = Order_agnostic_BinarySearchname(arr, target);
        if (result == (-1)) {
            System.out.println("Target element not found");
        } else {
            System.out.println("Target found at position :" + result);
        }

    }

    public static int Order_agnostic_BinarySearchname(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending or descending order
        boolean ans = arr[start] < arr[end];
        while (start <= end) {

            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else {
                if (ans) {

                    if (arr[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                } else {
                    if (arr[mid] < target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}


