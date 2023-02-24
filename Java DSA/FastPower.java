
//import java.util.*;
import java.util.Arrays;

public class FastPower {
    public static void main(String[] args) {
        String s = "DORWBL4A16H1";
        /*
         * String str = "GEEKSFORGEEKS123";
         * // Creating array and storing the array
         * // returned by toCharArray() method
         * char[] ch = str.toCharArray();
         * 
         * //
         */

        char[] ch = s.toCharArray();

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        System.out.println();
        String str = "";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {

            // char c= s.charAt(i);
            if (ch[i] >= 48 && ch[i] <= 57) {
                sum += ch[i];
            } else {
                str += ch[i];
            }
            // if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
            // sum += (s.charAt(i) - 48);
            // } else {
            // str += s.charAt(i);
            // }
        }
        str += sum;
        System.out.println(str);
    }
    // static int fastPowerFunction(int a, int b) {

    // int res = 1;
    // while(b>0){
    // if(b&1 !0){

    // }
    // }
}
