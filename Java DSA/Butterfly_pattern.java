import java.util.Scanner;

public class Butterfly_pattern {
    public static void main(String[] args) {
        try (// Patten code
                Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Row Number : ");
            int row = sc.nextInt();
            int space;

            // code for upper part
            for (int i = 1; i <= row; i++) {
                for (int j = 1; j <= i; j++) { // loop for pattern of first half
                    System.out.print("*");
                }
                for (space = 1; space <= row - i; space++) { // loop for spaces of first half
                    System.out.print(" ");
                }
                for (space = 1; space <= row - i; space++) {// loop for spaces of second half
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) { // loop for pattern of second half
                    System.out.print("*");
                }
                System.out.println();
            }

            // similar code with a little bit conditional changes for lower part
            for (int i = row; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                for (space = 1; space <= row - i; space++) {
                    System.out.print(" ");
                }
                for (space = 1; space <= row - i; space++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

    }

}
