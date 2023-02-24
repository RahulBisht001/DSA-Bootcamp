// import java.util.ArrayList;
// import java.util.Arrays;

public class Stringdemo {

    public static void main(String[] args) {
        // code
        /*
         * int[] arr = new int[5];
         * // String ans = (new Integer(69) + " " + new ArrayList<>());
         * // System.out.println(ans);
         * System.out.println("ab" + new ArrayList<>());
         * System.out.println("ab" + Arrays.toString(arr));
         * System.out.println(2);
         * // System.out.println("b" + "a");
         */

        // String Performance
        String ans = "";

        for (int i = 0; i < 26; i++) {
            ans += (char) ('a' + i);
        }
        System.out.println(ans);
    }
}
