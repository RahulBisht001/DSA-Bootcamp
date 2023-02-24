import java.util.Scanner;

public class Bit_manupulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter OPeration");
        System.out.println(sc);
        int op = sc.nextInt();
        int n = 5;
        int pos = 1;
        // bit to 1 else bit to 0
        int bitmask = 1 << pos;
        if (op == 1) {
            // set
            int num = bitmask | n;
            System.out.println(num);
        } else {
            // clear
            int not = ~(bitmask);
            int num = not & n;
            System.out.println(num);
        }

    }
}
