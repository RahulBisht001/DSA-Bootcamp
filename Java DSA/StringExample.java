//import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

        // Strings are immutabel in java
        // some Commanly used String Methods in java
        // Scanner in = new Scanner(System.in);
        // String intialization and declaration
        /*
         * String str = "Rahul Bisht";
         * System.out.println("Enter Your name: ");
         * System.out.println(in.next()); // it discard the string after spaces
         * System.out.println(in.nextLine()); // takes whole line basically it also
         * include spaces
         * 
         */

        // Operations On Strings

        // concatination
        /*
         * String first = in.nextLine();
         * String last = in.nextLine();
         * System.out.println(first + " " + last);
         */

        // Length Of the String
        /*
         * String first = in.nextLine();
         * System.out.println(first);
         * System.out.println(first.length());
         */

        // Accessing Each Character of String
        // charAt() Method
        /*
         * String name = "Rahul Bisht";
         * System.out.println(name);
         * System.out.println(name.length());
         * for (int i = 0; i < name.length(); i++) {
         * System.out.print(name.charAt(i) + " ");
         * }
         */

        /*
         * // indexOf() Method
         * // lastIndexOf() Method
         * // it will return the index of first index of that Char or substring
         * String name = "Rahuxahul ";
         * System.out.println(name.indexOf("ahu"));
         * 
         * // indexOf(substring , start_from_Here)
         * System.out.println(name.indexOf("ahu", 2));
         * System.out.println(name.lastIndexOf("ahu", 1));
         */

        // Comparing Strings
        /*
         * String str1 = "AAhul";
         * String str2 = "ABhul";
         * // cases
         * // if( str1 == str2) : 0
         * // if( str1> str2) : + ve value
         * // if( str1 < str2) : -ve value
         * System.out.println((str1.compareTo(str2)));
         */

        /*
         * // equals() Method
         * String name = "Rahul";
         * // it will return Boolean value
         * // Strings are case sensitive so Rahul ans rahul are two different Strings
         * System.out.println(name.equals("Rahul"));
         * // equalsIgnoreCase()Method
         * System.out.println(name.equalsIgnoreCase("rAhul"));
         */

        /*
         * //Substring method
         * 
         * // Substring : Basically we can cut a part from string
         * // we use .Substring(begining index , end index)
         * // but ending index +1 is prefferd beacause ending is exclusive
         * 
         * String str = "Rahul Bisht is a Good Programmer";
         * String name = str.substring(6, str.length());
         * System.out.println(name);
         */

        /*
         * // tolowerCase() Method
         * 
         * String name = "RAHUL BISHT";
         * String str = name.toLowerCase();
         * System.out.println(name);
         * System.out.println(str);
         */

        /*
         * // toupperCase() Method
         * String str = "rahul Bisht";
         * System.out.println(str.toUpperCase());
         */

        /*
         * // trim() Method
         * // it returns a string after trim the Leading and Trailing spaces
         * // Point to be Noted it has Nothing to do with in btw spaces , okk.
         * String nonTrimmedName = "    Rahul      ";
         * System.out.println(nonTrimmedName.trim());
         * String name = "    Rahul Bisht    ";
         * System.out.println(name.trim());
         */

        /*
         * // replace(target , replacement) Method
         * // Here Inside the argeuments of replace Method ,Only (Char ,Char ) is valid,
         * 
         * 
         * # The Bonus tip is that is will replace all the occurences
         * 
         * // Can't Change the Length like replace R in Rahul with rb
         * // Character To charecter Replacement is Allowed Only
         * String name = "Rahul";
         * System.out.println(name);
         * System.out.println(name.replace('l', 'L'));
         */

        /*
         * // replace(substring , substring) Method
         * String name = "Rahul Bisht";
         * System.out.println(name.replace("h", "RA"));
         * // You can Replace a Sub String with another and it will replace all its
         * // occurences
         * // But we can't replace any Character with Substring or Viceversa
         */

        /*
         * // startsWith() Method
         * String str = "Rahul";
         * System.out.println(str.startsWith("R"));
         * // endWith()Method
         * System.out.println(str.endsWith("ul"));
         */
    }
}