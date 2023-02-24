import java.util.Scanner;

public class Solid_rombus {
    public static void main(String[] args) {
        // code

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Row Numbers");
            int row = sc.nextInt();
            // int col = 2 * row - 1;
            int space;
            int star;
            // pattern code
            for (int i = 1; i <= row; i++) {

                // spaces
                for (space = 1; space <= row - i; space++) {
                    System.out.print("  ");
                }
                for (star = 1; star <= row; star++) {
                    System.out.print("# ");
                }
                System.out.println();

            }
        }
    }

}
