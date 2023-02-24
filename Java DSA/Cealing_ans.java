public class Cealing_ans {
    public static void main(String[] args) {
        long ans = findSum("1abc23");
        System.out.println(ans);
    }

    public static long findSum(String str) {
        // your code here
        int n = str.length();
        long num2 = 0, x = 10;
        long sum = 0, count = 0;

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 48 && ch <= 57) {
                num2 = num2 * x + (ch - 48);
                count = 0;

            } else {
                if (count == 0) {
                    sum += num2;
                    num2 = 0;
                    count = 1;
                }
            }
        }
        sum += num2;
        return sum;
    }
}

// int arr[] = { 2, 3, 3, 4, 9, 14, 18 };
// int n = arr.length;
// int target = 4, ans = 0;
// int start = 0;
// int end = n;

// while (start <= end) {
// int mid = start + (end - start) / 2;

// if (arr[mid] == target) {
// ans = arr[mid];
// break;
// } else if (arr[mid] > target) {
// ans = arr[mid];
// end = mid - 1;
// } else {
// start = mid + 1;
// }
// }

// System.out.println(ans);