import java.util.Arrays;

public class StringKunal {
    public static void main(String[] args) {

        String name = "Thisis123callme123now123just now";
        System.out.println(name.isEmpty());
        /*
         * Returns true if, and only if, length() is 0.
         * Returns:
         * true if length() is 0, otherwise false
         */
        System.out.println(name.isBlank());
        /*
         * returns true if the string is empty or contains only
         * white space codepoints, otherwise false.
         * Returns:
         * true if the string is empty or contains only white space codepoints,
         * otherwise false
         */
        System.out.println(name.strip());
        /*
         * Returns a string whose value is this string,
         * with all leading and trailing white space removed.
         * If this String object represents an empty string, or
         * if all code points in this string are white space, then an empty string is
         * returned.
         * Otherwise, returns a substring of this string beginning with
         * the first code point that is not a white space up to
         * and including the last code point that is not a white space.
         */
        System.out.println(Arrays.toString(name.split("123")));
        /*
         * Splits this string around matches of the given regular expression.
         * This method works as if by invoking the two-argument split method with
         * the given expression and a limit argument of zero. Trailing empty strings are
         * therefore not included in the resulting array.
         * The string "boo:and:foo", for example, yields the
         * following results with these expressions:
         * 
         * Parameters:
         * regex the delimiting regular expression
         * Returns:
         * the array of strings computed by splitting this string around matches of the
         * given regular expression
         * Throws:
         * PatternSyntaxException - if the regular expression's syntax is invalid
         */

    }
}

// // code
/*
 * String name1 = new String("Rahul");
 * // System.out.println(name);
 * String name2 = new String("Rahul");
 * System.out.println(name1.equals(name2));
 * System.out.println(34);
 * String r = "";
 * System.out.println(r);
 */
/*
 * String str = "Rahul";
 * int n = str.length();
 * 
 * int arr[] = { 1, 2, 3, 4, 5, 6, };
 * int s = arr.length;
 * System.out.println(s);
 * System.out.println(Arrays.toString(new int[] { 1, 2, 3, 4, 5, 6, }));
 * // System.out.println(45.34);
 */

// char ch[] = name.toCharArray();
// System.out.println(Arrays.toString(ch));

// System.out.println(name.toUpperCase());
// System.out.println(name);
// System.out.println(name.indexOf('b', 7));
// System.out.println(name.indexOf("bis", 7));