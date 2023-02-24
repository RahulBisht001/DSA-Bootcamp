import java.util.Scanner;
import java.util.Arrays;

public class arrays2 {
    public static void main(String[] args) {
        // code

        String[] str = new String[4];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.nextLine();
            }
        }

        System.out.println(Arrays.toString(str));
    }

}
