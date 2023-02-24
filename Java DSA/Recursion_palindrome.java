public class Recursion_palindrome {
    public static void main(String[] args) {

        String str = "abcba";
        int n = str.length();
        int i = 0;
        boolean bool = palindrome(str, i, n);
        System.out.println(bool);
    }

    static boolean palindrome(String str, int i, int n) {
        if (i > n - i - 1) {
            return true;
        }

        if (str.charAt(i) != str.charAt(n - i - 1)) {
            return false;
        } else {
            return palindrome(str, ++i, n);
        }
    }
}
