import java.util.Scanner;

public class Palindrome_pattern {
    public static void main(String[] args) {
        int row;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Row Number\n");
            row = sc.nextInt();
        }
        // int col = 2 * row - 1;
        int space;
        int count, j;
        int flag;
        for (int i = 1; i <= row; i++) {

            // For Spaces

            for (space = 1; space <= row - i; space++) {
                System.out.print("  ");
            }

            // For Numbers

            count = i;
            flag = 0;
            for (j = 1; j <= 2 * i - 1; j++) {

                if (count == 1) {
                    flag = 1;
                }

                if (flag == 0) {
                    System.out.print(count + " ");
                    count--;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            System.out.println();
        }
    }
}
