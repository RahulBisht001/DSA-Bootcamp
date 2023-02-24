public class algo {
    static int count = 0;

    public static void main(String[] args) {
        int n = 27;
        boolean bool = isPowerOfThree(n);
        System.out.println(bool);
        System.out.println(Math.pow(3, count) == (float) n);
    }

    public static boolean isPowerOfThree(int n) {

        if (n % 2 == 0 || n == 0) {
            return false;
        } else if (n == 1) {
            if (Math.pow(3, count) == n) {
                return true;
            } else {
                return false;
            }
        } else {
            count++;
            return isPowerOfThree(n / 3);
        }
    }
}