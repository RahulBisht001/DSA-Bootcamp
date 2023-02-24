//import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {

        String str = "axbcxxd";
        String p = "";

        System.out.println(moveX(p, str));
    }

    public static String moveX(String p, String str) {
        if (str.isEmpty()) {
            return "";
        }

        char ch = str.charAt(0);
        if (ch == 'x') {
            moveX(p, str.substring(1));
            p += "x";
            return p;
        } else {
            p += ch;
            moveX(p, str.substring(1));
            return p;
        }
    }
}
