// //package com.Questions;

// public class Main {
//    public static void main(String[] args) {
//       // code for solid Rectangle
//       /*
//        * for (int i= 1; i<=5; i++)
//        * {
//        * for (int j=1; j<=10; j++)
//        * {
//        * System.out.print("*");
//        * }
//        * System.out.println();
//        * }
//        */

//       // Hollow Rectangle
//       /*
//        * for (int row = 1; row <= 5; row++) {
//        * for (int col = 1; col <= 5; col++) {
//        * 
//        * if ((row == 1) || (col == 1) || (row == 5) || (col == 5)) {
//        * System.out.print("*");
//        * } else {
//        * System.out.print(" ");
//        * }
//        * }
//        * System.out.println();
//        * 
//        * }
//        */

//       /*
//        * 
//        * for (int row = 1; row <= 5; row++) {
//        * for (int col = 1; col <= row; col++) {
//        * System.out.print("**");
//        * }
//        * System.out.println();
//        * }
//        */

//       for (int row = 5; row >= 1; row--) {
//          for (int col = 1; col <= row; col++) {
//             System.out.print(col + " ");
//          }
//          System.out.println();
//       }
//    }
// }
public class Operator {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 5;
        int d;

        if (a > 3 & (b = c + 4) > 1) {
            d = 35;
            System.out.println(d);
        }
        System.out.println(b);
        System.out.println(a);

    }
}