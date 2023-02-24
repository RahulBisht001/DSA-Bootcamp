import java.util.Arrays;

public class Custom_comparator {

    public static void test() {
        Integer[] arr = { 2, 5, 1, -1, 0, 5, 3, 2, 5, -4, 3 };

        // lambda Expression
        // Default Behaviour -> Incresing Order
        Arrays.sort(arr, (a, b) -> {
            return b - a;
        });
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        test();
    }

}
