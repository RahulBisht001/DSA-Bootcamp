import java.util.HashSet;
//import java.util.Iterator;

public class HashSetDSA {
    public static void main(String[] args) {

        // Code
        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(100);
        h.add(30);
        h.add(500);
        h.add(40);
        h.add(10);
        System.out.println(h.size());
        System.out.println(h);

        // Iterator
        // Iterator it = h.iterator();

        /*
         * // hasNext function
         * System.out.println(it.next());
         * System.out.println(it.next());
         * // System.out.println(it.next());
         * 
         * System.out.println(it.hasNext());
         */
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
    }
}
