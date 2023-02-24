import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion Opertion

        /*
         * Either the Key value exixt in Map and value get Updated
         * else completely new key value pair will be inserted5
         */
        map.put("India", 120);
        map.put("US", 100);
        map.put("Israel", 20);
        System.out.println(map.toString());
        map.put("India", 130);
        System.out.println(map.toString());

        // Search operation
        if (map.containsKey("indonesia")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // Value of particular Key
        System.out.println(map.get("India"));
        System.out.println(map.get("Ram"));

        /*
         * Iteration in Hashmap
         * for each loop
         * 
         */
        for (Map.Entry<String, Integer> num : map.entrySet()) {
            System.out.print(num.getKey() + "  ");
            System.out.println(num.getValue() + " ");
        }

        /*
         * for each loop for array
         * int arr[] = { 1, 4, 7, 8, 9, 3, 7, 9 };
         * for (int i : arr) {
         * System.out.print(i + " ");
         * }
         */

        // Remove key pair set

        map.remove("US");
        System.out.println(map.toString());

    }
}
