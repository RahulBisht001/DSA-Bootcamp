import java.util.Arrays;

public class Variable_length_argument {
    public static void main(String[] args) {
        // code
        fun(20, 30, "Rahul", "Bisht", "NITIN");
    }

    static void fun(int a, int b, String... v) {
        System.out.println(a + " " + b);
        System.out.println(Arrays.toString(v));
    }

}
